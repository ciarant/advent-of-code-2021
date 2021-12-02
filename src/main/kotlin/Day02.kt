/**
 * Day 2: [Dive!](https://adventofcode.com/2021/day/2)
 */
class Day02(private val input: List<String>) { // TODO Accept a list of Pair<String, Int> instead

    fun solvePart1() =
        input.fold(Submarine(0, 0)) { submarine, instruction ->
            val (direction, amount) = instruction.split(" ")
            when (direction) {
                "forward" -> submarine.forward(amount.toInt())
                "down" -> submarine.down(amount.toInt())
                "up" -> submarine.up(amount.toInt())
                else -> throw IllegalArgumentException("Unknown instruction: $instruction")
            }
        }.let { it.x * it.y }

    fun solvePart2() =
        input.fold(AimySubmarine(0, 0, 0)) { submarine, instruction ->
            val (direction, amount) = instruction.split(" ")
            when (direction) {
                "forward" -> submarine.forward(amount.toInt())
                "down" -> submarine.down(amount.toInt())
                "up" -> submarine.up(amount.toInt())
                else -> throw IllegalArgumentException("Unknown instruction: $instruction")
            }
        }.let { it.x * it.y }

    data class Submarine(val x: Int, val y: Int) {
        fun forward(amount: Int): Submarine = copy(x = x + amount, y = y)
        fun down(amount: Int): Submarine = copy(x = x, y = y)
        fun up(amount: Int): Submarine = copy(x = x, y = y - amount)
    }

    // TODO ughhh - figure out a way to avoid two very similar submarine classes
    data class AimySubmarine(val x: Int, val y: Int, val aim: Int) {
        fun forward(amount: Int): AimySubmarine = copy(x = x + amount, y = y + (aim * amount), aim = aim)
        fun down(amount: Int): AimySubmarine = copy(x = x, y = y, aim = aim + amount)
        fun up(amount: Int): AimySubmarine = copy(x = x, y = y, aim = aim - amount)
    }
}
