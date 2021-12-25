# File Input

Read a file as input.

## Read Lines

Load a file by line where each string is a new line.

```kotlin
import java.io.File

val input: List<String> = File("input.txt")
  .bufferedReader()
  .readLines()
```

```kotlin
import java.io.File

val input: Sequence<String> = File("input.txt")
  .bufferedReader()
  .lineSequence()
```

## Generate Sequence

Load a file by a delimiter as a `List<String>` where each string segment is split by that delimiter.

```kotlin
import java.io.File
import java.util.Scanner
import kotlin.sequences.generateSequence

val input: List<String> = Scanner(File("input.txt"))
  .apply { useDelimiter("") }
  .use { scanner ->
    generateSequence { if(scanner.hasNext()) scanner.next() else null }
    .toList()
  }
```

## Read Entire File

Load the entire file as a single string.

```kotlin
import java.io.File

val input: List<String> = File("input.txt")
  .bufferedReader()
  .readText()
```
