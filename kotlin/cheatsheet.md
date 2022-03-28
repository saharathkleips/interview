# Cheatsheet

| Data Structure | Get    | Contains | Add    | Remove | Space  |
|----------------|--------|----------|--------|--------|--------|
| Array          | 1      | n        | n      | n      | n      |
| Stack          | 1      | N/A      | 1      | 1      | n      |
| Queue          | 1      | N/A      | 1      | 1      | n      |
| Linked List    | n      | n        | 1      | 1      | n      |
| Linked Map     | 1      | 1        | 1      | 1      | 2n     |
| Map            | 1      | 1        | 1      | 1      | n      |
| Set            | N/A    | 1        | 1      | 1      | n      |
| Heap           | 1      | N/A      | log(n) | log(n) | n      |
| Binary Tree    | n      | n        | n      | n      | n      |
| Tree Map       | log(n) | log(n)   | log(n) | log(n) | n      |
| Trie           | n      | n        | n      | n      | n      |
| Adjacency List | 1      | 1        | 1      | O(e)   | O(n+e) |

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
        list.removeFirst().takeIf { it !in visited }?.let { // Breadth (Queue)
        list.removeLast().takeIf { it !in visited }?.let { // Depth (Stack)
            // -- Do Stuff --
            this[it]?.let(list::addAll)
            visited.add(it)
        }
    }
}
```

## Memoization

```kotlin
class Memoize<in In, out Out>(private val fn: (In) -> Out): (In) -> Out {
    private val memos: MutableMap<In, Out> = mutableMapOf()
    override operator fun invoke(input: In): Out = memos.getOrPut(input) { fn(input) }
}

val memoizedFn = Memoize(::fn)
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

## Trie

```kotlin
class Trie {
    data class Node(
        val key: Char,
        var end: Boolean = false, 
        val children: MutableMap<Char, Node> = mutableMapOf(),
    )
    val root = Node('\u0000')
}

fun Trie.insert(word: String) {
    word.fold(root) { node, char -> node.children.getOrPut(char) { Trie.Node(char) } }
        .end = true
}

operator fun Trie.contains(word: String): Boolean =
    word.fold(root) { node, char -> node.children.getOrElse(char) { return false } }
        .end == true
```

### Starts With

```kotlin
fun Trie.startsWith(prefix: String): List<String> {
    fun Trie.Node.collectAll(prefix: String): List<String> =
        (if (end) mutableListOf(prefix) else mutableListOf()).apply {
            addAll(children.values.flatMap { it.collectAll(prefix + it.key) })
        }
    
    return prefix.fold(root) { node, char -> node.children.getOrElse(char) { return emptyList() } }
        .collectAll(prefix)
}
```

## Tree

```kotlin
data class Node<T>(val value: T, val children: MutableList<Node<T>> = mutableListOf())
fun <T> Node<T>.add(value: T): Node<T> = Node(value).also { children.add(it) }
```

### Breadth/Depth-First Search

```kotlin
fun <T> Node<T>.search() {
    val list: MutableList<Node<T>> = mutableListOf(this)
    while(list.isNotEmpty()) {
        list.removeFirst().let { // Breadth
        list.removeLast().let { // Depth
            // -- Do Stuff --
            list.addAll(it.children)
        }
    }
}
```
