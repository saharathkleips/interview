# Quick Sort

Divide and conquer sorting algorithm that chooses an element as a "pivot"
and then partitions the array around the selected pivot. This implementation
is recursive and is done in-place.

## Complexity

| Worst Case Time | Best Case Time | Average Time | Worst Case Space |
| --------------- | -------------- | ------------ | ---------------- |
| `O(n^2)`        | `O(n*logn)`    | `O(n*logn)`  | `O(1)`           |

# Implementation

```kotlin
fun <T : Comparable<T>> Array<T>.quicksort(left: Int = 0, right: Int = size - 1): Array<T> = apply {
    if (left < right) {
        val pivot = partition(left, right)
        quicksort(left, pivot - 1)
        quicksort(pivot, right)
    }
}

fun <T : Comparable<T>> Array<T>.partition(left: Int, right: Int): Int {
    var l = left
    var r = right
    val pivot = this[(l + r) / 2]
    
    while (l <= r) {
        while (this[l] < pivot) l++
        while (this[r] > pivot) r--
        if (l <= r) {
            this[l] = this[r].also { this[r] = this[l] }
            l++
            r--
        }
    }

    return l
}
```
