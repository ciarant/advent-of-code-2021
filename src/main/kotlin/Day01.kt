/**
 * Day 1: [Sonar Sweep](https://adventofcode.com/2021/day/1)
 */
class Day01(private val input: List<Int>) {

    /**
     * Count the number of times a depth measurement increases from the previous measurement.
     */
    fun solvePart1() = input.zipWithNext().count { it.second > it.first }

    /**
     * Count the number of times the sum of measurements in a sliding window of size 3 increases from the sum of
     * measurements in the previous window.
     */
    fun solvePart2() =
        input.windowed(3).zipWithNext().count { it.second.sum() > it.first.sum() }
}
