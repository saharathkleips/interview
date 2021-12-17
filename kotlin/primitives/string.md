# String

A sequence of characters and string literals.

## Split by Line

Splits the string delimited by new lines.

```kotlin
"""
aa
bb
cc
""".lines() // ["aa", "bb", "cc"]

"""
aa
bb
cc
""".lineSequence() // Sequence ["aa", "bb", "cc"]
```

## Split by Delimiter

Splits the string delimited by a defined string.

```kotlin
"1,2,3".split(",") // ["1", "2", "3"]
```