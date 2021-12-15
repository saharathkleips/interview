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
