# Priority Queue

Similar to a queue, but elements are always sorted in their natural order.
We can utilize the priority queue as a min-heap or a max-heap.
`PriorityQueue` does not guarantee iteration order, so do not expect something like printing to work correctly.

## Instantiate

The default instantiation is a min-heap. Pass in your own `Comparator` to configure the behavior.

```kotlin
import java.util.PriorityQueue

val priorityQueue = PriorityQueue<Int>()
```

### Min-Heap

The smallest number is always on top.

```kotlin
val priorityQueue = PriorityQueue<Int> { a, b -> a - b }
```

### Max-Heap

The largest number is always on top.

```kotlin
val priorityQueue = PriorityQueue<Int> { a, b -> b - a }
```

## Add

Add an item to the priority queue.

```kotlin
priorityQueue.add(3) // [3]
priorityQueue.add(1) // [3,1]
priorityQueue.add(2) // [3,2,1]
```

## Remove

Remove an item from the front of the priority queue.

```kotlin
priorityQueue.poll() // 3 - [2,1]
priorityQueue.poll() // 2 - [1]
priorityQueue.poll() // 1 - []
```

## Peek

Return the element at the front of the priority queue.

```kotlin
priorityQueue.peek()
```
