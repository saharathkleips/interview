# Map

A collection of key-value pairs, useful for constant time access and insert.

## Instantiate

A map doesn't guarantee insertion order, but `LinkedHashMap` specifically does.

```kotlin
val map = mutableMapOf<String, Int>()
```

## Put

Add an entry to the map.

```kotlin
map["one"] = one // [("one", 1)]
map.put("two", 2) // [("one", 1), ("two", 2)]
```

## Get

Get a value from the map by its key, null if it does not exist.

```kotlin
map["one"] // 1
map.get("two") // 2
```

## Get or Put

Get a value from the map by its key, or insert a default value if it does not exist.

```kotlin
map.getOrPut("one") { 5 } // 1
map.getOrPut("three") { 4 } // 4
```

## Contains Key

Check if a key exists in the map.

```kotlin
"one" in map // true
map.containsKey("five") // false
```

## Remove

Remove an entry from the map.

```kotlin
map.remove("one") // 1
```
