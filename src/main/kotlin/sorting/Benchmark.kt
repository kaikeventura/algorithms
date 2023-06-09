package sorting

import sorting.bubble_sort.bubbleSort
import sorting.counting_sort.countingSort
import sorting.heap_sort.heapSort
import sorting.insertion_sort.insertionSort
import sorting.merge_sort.mergeSort
import sorting.quick_sort.quickSort
import java.util.Random
import kotlin.system.measureNanoTime

fun main() {
    val shortArrayNumbers = randomNumbers(10)
    val performanceTimeAlgorithmsWithShotList = mutableMapOf(
        "Bubble sort with a short list" to shortArrayNumbers.clone().let { measureNanoTime { bubbleSort(it) } },
        "Merge sort with a short list" to shortArrayNumbers.clone().let { measureNanoTime { mergeSort(it) } },
        "Quick sort with a short list" to shortArrayNumbers.clone().let { measureNanoTime { quickSort(it, 0, it.size - 1) } },
        "Insertion sort with a short list" to shortArrayNumbers.clone().let { measureNanoTime { insertionSort(it) } },
        "Heap sort with a short list" to shortArrayNumbers.clone().let { measureNanoTime { heapSort(it) } },
        "Counting sort with a short list" to shortArrayNumbers.clone().let { measureNanoTime { countingSort(it) } }
    )
    performanceTimeAlgorithmsWithShotList.toList().sortedBy { (_, value) -> value }.toMap().forEach { println(it) }

    println()

    val bigArrayNumbers = randomNumbers(10000)
    val performanceTimeAlgorithmsWithBigList = mutableMapOf(
        "Bubble sort with a big list" to bigArrayNumbers.clone().let { measureNanoTime { bubbleSort(it) } },
        "Merge sort with a big list" to bigArrayNumbers.clone().let { measureNanoTime { mergeSort(it) } },
        "Quick sort with a big list" to bigArrayNumbers.clone().let { measureNanoTime { quickSort(it, 0, it.size - 1) } },
        "Insertion sort with a big list" to bigArrayNumbers.clone().let { measureNanoTime { insertionSort(it) } },
        "Heap sort with a big list" to bigArrayNumbers.clone().let { measureNanoTime { heapSort(it) } },
        "Counting sort with a big list" to bigArrayNumbers.clone().let { measureNanoTime { countingSort(it) } }
    )
    performanceTimeAlgorithmsWithBigList.toList().sortedBy { (_, value) -> value }.toMap().forEach { println(it) }
}

fun randomNumbers(size: Long): IntArray =
    Random().ints(0, 999999999)
        .limit(size)
        .toArray()
