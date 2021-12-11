# File Input

Read a file as input.

## Read Lines

Load a file by line as a `List<String>` where each string is a new line.

```kotlin
import java.io.File

val input: List<String> = File("input.txt")
  .bufferedReader()
  .readLines()
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