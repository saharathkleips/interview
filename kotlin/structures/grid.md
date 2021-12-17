# Grid

A 2D grid of elements. Normally represented by a list of lists `List<List<T>>`.

## Instantiate

```kotlin
listOf(
    listOf(1,2,3),
    listOf(4,5,6),
    listOf(7,8,9),
) // [[1,2,3],[4,5,6],[7,8,9]]
```

## Index is Valid

Check if a given index (row,column) is within the grid.

```kotlin
operator fun List<List<*>>.contains(index: Pair<Int, Int>): Boolean = index.first in indices && index.second in this[index.first].indices

(0,1) in list // true
(-1, 1) in list // false
(2,3) in list // false
```