// Given a list `a` of N integers, returns the smallest positive integer that does not occur in the list.

fun solution(a: List<Int>): Int = a.toSet().let { set -> (1..Int.MAX_VALUE).first { set.contains(it).not() } }

listOf(
    solution(listOf(1,2,3)), // 4
    solution(listOf(-1,-1,-2)), // 1
    solution(listOf(2,3,4)), // 1
    solution(listOf(1,3,4)), // 2
    solution(listOf(1,1,1)), // 2
).forEach(::println)
