package sorting.heap_sort

fun main() {
    val numbers = intArrayOf(5, 3, 8, 4, 2)
    heapSort(numbers)
    numbers.forEach { println(it) }
}

fun heapSort(numbers: IntArray) {
    val n = numbers.size

    for (i in (n / 2 - 1) downTo 0) {
        heapify(numbers, n, i)
    }

    for (i in (n - 1) downTo 0) {
        val temp = numbers[0]
        numbers[0] = numbers[i]
        numbers[i] = temp

        heapify(numbers, i, 0)
    }
}

private fun heapify(array: IntArray, n: Int, i: Int) {
    var largest = i // Inicializa o maior elemento como a raiz
    val left = 2 * i + 1
    val right = 2 * i + 2

    // Verifica se o filho esquerdo é maior que a raiz
    if (left < n && array[left] > array[largest]) {
        largest = left
    }

    // Verifica se o filho direito é maior que a raiz
    if (right < n && array[right] > array[largest]) {
        largest = right
    }

    // Se o maior elemento não for a raiz, troca a raiz com o maior elemento
    if (largest != i) {
        val temp = array[i]
        array[i] = array[largest]
        array[largest] = temp

        // Aplica a operação de heapify recursivamente no subárvore afetada
        heapify(array, n, largest)
    }
}
