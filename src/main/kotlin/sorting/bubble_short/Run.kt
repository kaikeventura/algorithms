package sorting.bubble_short

fun main() {
    val numbers = intArrayOf(5, 3, 8, 4, 2)
    bubbleSort(numbers)
    numbers.forEach { println(it) }
}

fun bubbleSort(numbers: IntArray) {
    val arraySize = numbers.size
    var temp: Int

    for (i in 0 until arraySize - 1) {
        for (j in 0 until arraySize - i - 1) {
            if (numbers[j] > numbers[j + 1]) {
                temp = numbers[j]
                numbers[j] = numbers[j + 1]
                numbers[j + 1] = temp
            }
        }
    }
}
