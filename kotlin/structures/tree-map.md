# Tree Map

Tree Map, or Set, is a Map / Set structure backed by a balanced binary tree, and as a result
provides guaranteed `log(n)` time cost for all basic operations (get, add, remove, and contains).
Elements are stored ordered using natural ordering or a comparator and can be iterated over.

## Instantiate

```kotlin
import java.util.TreeMap

val treeMap = TreeMap<String, String>()
```

## Add

Add a value to the tree.

```kotlin
treeMap["one"] = one
```

## Remove

Remove a key from the tree.

```kotlin
treeMap.remove("one")
```

## Contains

Check whether the tree contains a key.

```kotlin
"one" in treeMap
```

## Lowest Entry

Return the lowest / smallest entry in the tree.

```kotlin
treeMap.firstEntry()
```

## Highest Entry

Return the highest / largest entry in the tree.

```kotlin
treeMap.lastEntry()
```
