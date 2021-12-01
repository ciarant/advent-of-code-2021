import java.io.File

class Day01(val input: List<Int>) {

    fun solvePart1() = input.zipWithNext().count { it.second > it.first }

    fun solvePart2() =
        input.windowed(3).zipWithNext().count { it.second.sum() > it.first.sum() }
}
