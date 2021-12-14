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

## Remove First N Elements

Remove the first N elements.

```kotlin
listOf("a", "b", "c").drop(1) // ["b", "c"]
listOf("a", "b", "c").drop(2) // ["c"]
```

## Remove Last N Elements

Remove the last N elements.

```kotlin
listOf("a", "b", "c").dropLast(1) // ["a", "b"]
listOf("a", "b", "c").dropLast(2) // ["a"]
```

## Group by Frequency

Count the frequency each element shows up in the list.

```kotlin
listOf("a", "b", "a", "c").groupingBy { it }.eachCount() // {a: 2, b: 1, c: 1}
```
