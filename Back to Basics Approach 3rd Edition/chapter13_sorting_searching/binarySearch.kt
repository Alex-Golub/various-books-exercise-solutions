package chapter13_sorting_searching

fun main() {
  val arr = intArrayOf(-4, 29, 17, 3, 94, 46, 8, 12)
  selectionSort(arr)
  println(arr.contentToString())
}

fun selectionSort(arr: IntArray) {
  for (i in 0 until arr.size - 1) {
    var minIdx = i
    for (j in i + 1 until arr.size) {
      if (arr[j] < arr[minIdx]) {
        minIdx = j
      }
    }
    swap(arr, i, minIdx)
  }
}

fun swap(arr: IntArray, i: Int, j: Int) {
  val temp = arr[i]
  arr[i] = arr[j]
  arr[j] = temp
}
