# Cheatsheet

## Adjacency List (Graphs)

```kotlin
fun <T> adjacencyListOf(vararg pairs: Pair<T, T>): MutableMap<T, MutableList<T>> = 
    mutableMapOf<T, MutableList<T>>().apply {
        pairs.forEach { 
            getOrPut(it.first, ::mutableListOf).add(it.second) // Directed
            // getOrPut(it.second, ::mutableListOf).add(it.first) // Undirected
        }
    }
```

### Breadth/Depth-First Search

```kotlin
fun <T> Map<T, List<T>>.search(): Unit {
    val visited: MutableSet<T> = mutableSetOf()
    val list: MutableList<T> = mutableListOf(keys.first())
    while (list.isNotEmpty()) {
        list.removeLast().takeIf { it !in visited }?.let { // Depth
        list.removeFirst().takeIf { it !in visited }?.let { // Breadth
            // -- Do Stuff --
            this[it]?.forEach(list::add)
            visited.add(it)
        }
    }
}
```

## Stack / Queue

```kotlin
val list = mutableListOf<Int>()
list.add(1) // Push / Enqueue
list.removeFirst() // Dequeue Queue (FIFO)
list.removeLast() // Pop Stack (LIFO)
```

## Heap

```kotlin
val minHeap = PriorityQueue<Int> { a, b -> a - b }
val maxHeap = PriorityQueue<Int> { a, b -> b - a }
heap.add(1) // Add
heap.poll() // Remove
```

## Memoization

```kotlin
class Memoize<in In, out Out>(private val fn: (In) -> Out): (In) -> Out {
    private val memos: MutableMap<In, Out> = mutableMapOf()
    override operator fun invoke(input: In): Out = memos.getOrPut(input) { fn(input) }
}

val memoizedFn = Memoize(::fn)
```
