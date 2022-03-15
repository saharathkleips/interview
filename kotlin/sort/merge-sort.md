# Merge Sort

Divide and conquer sorting algorithm that divides an array into two halves
and compares the elements.

## Complexity

| Worst Case Time | Best Case Time | Average Time | Worst Case Space |
| --------------- | -------------- | ------------ | ---------------- |
| `O(n*logn)`     | `O(n*logn)`    | `O(n*logn)`  | `O(n)`           |

# Implementation

```kotlin
fun <T : Comparable<T>> Array<T>.mergesort(left: Int = 0, right: Int = size - 1): Array<T> = apply {
    if (left < right) {
        val mid = left + ((right - left) / 2)
        mergesort(left, mid)
        mergesort(mid + 1, right)
        merge(left, mid, right)
    }
}

fun <T : Comparable<T>> Array<T>.merge(left: Int, mid: Int, right: Int) {
    val temp = copyOf()
    
    var l = left
    var m = mid + 1
    var index = left
    
    while (l <= mid && m <= right) {
        if (temp[l] < temp[m]) this[index++] = temp[l++]
        else this[index++] = temp[m++]
    }

    while (l <= mid) this[index++] = temp[l++]
    while (m <= right) this[index++] = temp[m++]
}
```
