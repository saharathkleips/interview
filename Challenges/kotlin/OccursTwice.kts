// Given a string str, in which every letter occurs at most once,
// find the letter that occurs twice.

fun solution(str: String): String =
    str.groupingBy { it }
        .eachCount()
        .entries
        .first { it.value == 2 }
        .let { it.key.toString() }

listOf(
    "aabc", // a
    "abbc", // b
    "abcc", // c
    "aa", // a
    "abcdefghijklmnopqrstuvwxyzj", // j
)
    .map { solution(it) }
    .forEach(::println)