# Priority Queue

Similar to a queue, but elements are always sorted in their natural order.

## Instantiate

```kotlin
import java.util.PriorityQueue

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
