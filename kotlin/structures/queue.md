# Queue

Provides first-in-first-out (FIFO) operations.

## Instantiate

Kotlin uses a generic mutable list to represent a queue.

```kotlin
val list = mutableListOf<Int>()
```

## Enqueue

Add an item to the end of the queue.

```kotlin
list.add(1) // [1]
list.add(2) // [1,2]
list.add(3) // [1,2,3]
```

## Dequeue

Remove an item from the front of the queue.

```kotlin
list.removeAt(0) // 1 - [2,3]
list.removeAt(0) // 2 - [3]
list.removeAt(0) // 3 - []
```

## Peek

Return the element from the front of the queue.

```kotlin
list.first()
```
