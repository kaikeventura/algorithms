package sorting.insertion_sort

fun main() {
    val numbers = intArrayOf(5, 3, 8, 4, 2)
    insertionSort(numbers)
    numbers.forEach { println(it) }
}

fun insertionSort(numbers: IntArray) {
    for (i in 1 until numbers.size) {
        val key = numbers[i]
        var j = i - 1
        while (j >= 0 && numbers[j] > key) {
            numbers[j + 1] = numbers[j]
            j--
        }
        numbers[j + 1] = key
    }
}
