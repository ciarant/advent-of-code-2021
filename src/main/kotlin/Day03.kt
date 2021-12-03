/**
 * Day 3: [Binary Diagnostic](https://adventofcode.com/2021/day/3)
 */
class Day03(private val input: List<Int>) {

    /**
     * Power consumption
     */
    fun solvePart1(): Int {
        val width = input.maxOf { it.bitWidth() } // Width of the widest input number (in bits)
        val gamma = (0 until width).sumOf { bitIndex ->
            // Are there more 1s than 0s in position 'bitIndex' over all the input numbers?
            val bit = if (input.count { it.bitAt(bitIndex) == 1 } > input.size / 2) 1 else 0
            bit.shl(bitIndex)
        }
        val epsilon = gamma.inv().rightmost(width)
        return gamma * epsilon
    }

    /**
     * Life support rating
     */
    fun solvePart2() {
        /*
         * multiply oxygen generator rating by the CO2 scrubber rating
         *
         * To find oxygen generator rating, determine the most common value (0 or 1) in the current bit position,
         * and keep only numbers with that bit in that position. If 0 and 1 are equally common, keep values with a
         * 1 in the position being considered.
         *
         * To find CO2 scrubber rating, determine the least common value (0 or 1) in the current bit position, and
         * keep only numbers with that bit in that position. If 0 and 1 are equally common, keep values with a 0
         * in the position being considered.
         */
    }

    private fun Int.bitWidth() = Int.SIZE_BITS - countLeadingZeroBits()
    private fun Int.bitAt(index: Int) = shr(index) % 2
    private fun Int.rightmost(bitCount: Int) = shl(Int.SIZE_BITS - bitCount).shr(Int.SIZE_BITS - bitCount)
}
