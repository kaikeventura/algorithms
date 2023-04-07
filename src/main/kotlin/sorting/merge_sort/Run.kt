package sorting.merge_sort

fun main() {
    val numbers = intArrayOf(5, 3, 8, 4, 2)
    mergeSort(numbers)
    numbers.forEach { println(it) }
}

fun mergeSort(numbers: IntArray) {
    if (numbers.size < 2) {
        return
    }
    val mid = numbers.size / 2
    val left = numbers.copyOfRange(0, mid)
    val right = numbers.copyOfRange(mid, numbers.size)
    mergeSort(left)
    mergeSort(right)
    merge(numbers, left, right)
}

private fun merge(numbers: IntArray, left: IntArray, right: IntArray) {
    var i = 0
    var j = 0
    var k = 0
    while (i < left.size && j < right.size) {
        if (left[i] <= right[j]) {
            numbers[k] = left[i]
            i++
        } else {
            numbers[k] = right[j]
            j++
        }
        k++
    }
    while (i < left.size) {
        numbers[k] = left[i]
        i++
        k++
    }
    while (j < right.size) {
        numbers[k] = right[j]
        j++
        k++
    }
}
