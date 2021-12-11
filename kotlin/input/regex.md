# Regex

Use regex to identify matching patterns within a string.

## Find

Find the find match within a string.

```kotlin
import kotlin.text.Regex

val (word: String, digit: String) = Regex("""(\w+) (\d+)""")
  .find("word 1234")!!
  .destructured
  //.toList()
```

## Find All

Find all matches within a string.

```kotlin
import kotlin.text.Regex

val pairs: List<Pair<String, String>> = Regex("""(\w+)=(\d+)""")
  .findAll("word1=123 word2=456 word3=789")
  .map { it.destructured }
  .map { (word: String, digit: String) -> word to digit }
  .toList()
```