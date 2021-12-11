# Stack

Provides last-in-first-out (LIFO) operations.

## Instantiate

Kotlin uses a double ended queue for stack related operations.

```kotlin
import kotlin.collections.ArrayDeque

val deque = ArrayDeque()
```

## Push

Add an item to the top of the stack.

```kotlin
deque.addFirst(1) // [1]
deque.addFirst(2) // [2,1]
deque.addFirst(3) // [3,2,1]
```

## Pop

Remove an item from the top of the stack.

```kotlin
deque.removeFirst() // 3 - [2,1]
deque.removeFirst() // 2 - [1]
deque.removeFirst() // 1 - []
```

## Peek

Return the element at the top of the stack.

```kotlin
deque.first()
```
