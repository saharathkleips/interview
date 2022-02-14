// Given a list `a` of N integers, returns the smallest positive integer that does not occur in the list.

fun solution(a: List<Int>): Int = a.toSet().let { set -> (1..Int.MAX_VALUE).first { set.contains(it).not() } }

listOf(
    listOf(1,2,3), // 4
    listOf(-1,-1,-2), // 1
    listOf(2,3,4), // 1
    listOf(1,3,4), // 2
    listOf(1,1,1), // 2
)
    .map { solution(it) }
    .forEach(::println)
