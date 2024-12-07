


fun main() {
    fun part1(input: List<String>): Int {
        return input.size
    }

    fun part2(input: List<String>): Int {
        return input.size
    }

    // Test if implementation meets criteria from the description, like:
   // check(part1(listOf("test_input")) == 1)

    // Or read a large test input from the `src/Day01_test.txt` file:
   // val testInput = readInput("d1")
  //  check(part1(testInput) == 1)

    // Read the input from the `src/Day01.txt` file.
    val input = readInput("d1")
    part1(input).println()
    part2(input).println()
}
/*import api.API_LINE_ITEM_SEPARATOR
import api.readInput

fun main() {
    val (inputList1, inputList2) = readInput(day = 1).map { line ->
        line.split(API_LINE_ITEM_SEPARATOR).let { it.first().toInt() to it.last().toInt() }
    }.unzip()

    println("Part 1: ${part1(inputList1, inputList2)}")
    println("Part 2: ${part2(inputList1, inputList2)}")
}

private fun part1(inputList1: List<Int>, inputList2: List<Int>): Int =
    inputList1.sorted().zip(inputList2.sorted()).sumOf { (first, second) -> abs(second - first) }

private fun part2(inputList1: List<Int>, inputList2: List<Int>): Int =
    inputList1.groupingBy { it }.eachCount().filterKeys { it in inputList2 }.entries.sumOf { it.key * it.value }
*/

