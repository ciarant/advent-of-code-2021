import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

@DisplayName("Day 3")
class Day03Test {
    val exampleInputs = listOf(
        0b00100, 0b11110, 0b10110, 0b10111, 0b10101, 0b01111, 0b00111, 0b11100, 0b10000, 0b11001, 0b00010, 0b01010
    )

    @Nested
    @DisplayName("Part 1")
    inner class Part1 {

        @Test
        fun `Matches example`() {
            assertEquals(198, Day03(exampleInputs).solvePart1())
        }

        @Test
        fun `Actual answer`() {
            val inputs = Resources.resourceAsList("day03.txt").map { it.toInt(2) }
            assertEquals(1025636, Day03(inputs).solvePart1())
        }
    }

    @Nested
    @DisplayName("Part 2")
    inner class Part2 {

        @Test
        fun `Matches example`() {
//            assertEquals(900, Day03(exampleInputs).solvePart2())
        }

        @Test
        fun `Actual answer`() {
//            val inputs = Resources.resourceAsList("day03.txt")
//            assertEquals(2138382217, Day03(inputs).solvePart2())
        }
    }
}
