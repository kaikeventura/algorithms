package sorting.counting_sort

fun main() {
    val numbers = intArrayOf(5, 3, 8, 4, 2)
    countingSort(numbers)
    numbers.forEach { println(it) }
}

fun countingSort(numbers: IntArray) {
    val max = numbers.maxOrNull() ?: return
    val counts = IntArray(max + 1)
    for (num in numbers) {
        counts[num]++
    }
    var i = 0
    for (num in 0..max) {
        for (j in 0 until counts[num]) {
            numbers[i++] = num
        }
    }
}
