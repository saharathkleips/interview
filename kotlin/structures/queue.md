# Queue

Provides first-in-first-out (FIFO) operations.

## Instantiate

Kotlin uses a double ended queue for queue related operations.

```kotlin
import kotlin.collections.ArrayDeque

val deque = ArrayDeque()
```

## Enqueue

Add an item to the end of the queue.

```kotlin
deque.addLast(1) // [1]
deque.addLast(2) // [1,2]
deque.addLast(3) // [1,2,3]
```

## Dequeue

Remove an item from the front of the queue.

```kotlin
deque.removeFirst() // 1 - [2,3]
deque.removeFirst() // 2 - [3]
deque.removeFirst() // 3 - []
```

## Peek

Return the element from the front of the queue.

```kotlin
deque.first()
```
