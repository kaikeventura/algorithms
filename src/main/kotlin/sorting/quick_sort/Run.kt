package sorting.quick_sort

fun main() {
    val numbers = intArrayOf(5, 3, 8, 4, 2)
    quickSort(numbers, 0, numbers.size - 1)
    numbers.forEach { println(it) }
}

fun quickSort(numbers: IntArray, start: Int, end: Int) {
    if (start < end) {
        val partitionIndex = partition(numbers, start, end)
        quickSort(numbers, start, partitionIndex - 1)
        quickSort(numbers, partitionIndex + 1, end)
    }
}

private fun partition(numbers: IntArray, start: Int, end: Int): Int {
    val pivot = numbers[end]
    var i = start - 1

    for (j in start until end) {
        if (numbers[j] <= pivot) {
            i++
            val temp = numbers[i]
            numbers[i] = numbers[j]
            numbers[j] = temp
        }
    }

    val temp = numbers[i + 1]
    numbers[i + 1] = numbers[end]
    numbers[end] = temp

    return i + 1
}
