# Iterable

Represents a sequence of elements that can be iterated over.

## Sort

Sort the elements by their natural sort order.

```kotlin
listOf("aa", "c", "bbb").sortedBy { it.length } // ["c", "aa", "bbb"]
listOf("aa", "c", "bbb").sortedByDescending { it.length } // ["bbb", "aa", "c"]
```

## Sum

Take the sum of all elements in the collection.

```kotlin
listOf(1,2,3).sumOf { it.value } // 6
```

## Filter by Instance

Retain only elements of a specified type.

```kotlin
listOf("a", 1, "b", true).filterIsInstance<String>() // ["a", "b"]
```