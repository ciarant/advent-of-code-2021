import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

@DisplayName("Day 1")
class Day01Test {
    val exampleInputs = listOf(
        199, 200, 208, 210, 200, 207, 240, 269, 260, 263
    );

    @Nested
    @DisplayName("Part 1")
    inner class Part1 {

        @Test
        fun `Matches example`() {
            assertEquals(7, Day01(exampleInputs).solvePart1())
        }

        @Test
        fun `Actual answer`() {
            val inputs = Resources.resourceAsList("day01.txt").map { it.toInt() }
            assertEquals(1759, Day01(inputs).solvePart1())
        }
    }

    @Nested
    @DisplayName("Part 2")
    inner class Part2 {

        @Test
        fun `Matches example`() {
            assertEquals(5, Day01(exampleInputs).solvePart2())
        }

        @Test
        fun `Actual answer`() {
            val inputs = Resources.resourceAsList("day01.txt").map { it.toInt() }
            assertEquals(1805, Day01(inputs).solvePart2())
        }
    }
}
