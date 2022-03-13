# Stack

Provides last-in-first-out (LIFO) operations.

## Instantiate

Kotlin uses a generic mutable list to represent a stack.

```kotlin
val list = mutableListOf<Int>()
```

## Push

Add an item to the top of the stack.

```kotlin
list.add(1) // [1]
list.add(2) // [1,2]
list.add(3) // [1,2,3]
```

## Pop

Remove an item from the top of the stack.

```kotlin
list.removeLast() // 3 - [1,2]
list.removeLast() // 2 - [1]
list.removeLast() // 1 - []
```

## Peek

Return the element at the top of the stack.

```kotlin
list.last()
```
