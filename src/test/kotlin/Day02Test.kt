import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

@DisplayName("Day 2")
class Day02Test {
    val exampleInputs = listOf(
        "forward 5", "down 5", "forward 8", "up 3", "down 8", "forward 2"
    );

    @Nested
    @DisplayName("Part 1")
    inner class Part1 {

        @Test
        fun `Matches example`() {
            assertEquals(150, Day02(exampleInputs).solvePart1())
        }

        @Test
        fun `Actual answer`() {
            val inputs = Resources.resourceAsList("day02.txt")
            assertEquals(2120749, Day02(inputs).solvePart1())
        }
    }

    @Nested
    @DisplayName("Part 2")
    inner class Part2 {

        @Test
        fun `Matches example`() {
            assertEquals(900, Day02(exampleInputs).solvePart2())
        }

        @Test
        fun `Actual answer`() {
            val inputs = Resources.resourceAsList("day02.txt")
            assertEquals(2138382217, Day02(inputs).solvePart2())
        }
    }
}
