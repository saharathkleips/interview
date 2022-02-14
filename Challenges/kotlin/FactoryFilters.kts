// Given a list of N factories' pollution amount, determine
// how many filters do we have to apply to reduce the total amount
// of pollution by half.

// Each filter applied reduces the pollution of a single factory by 2.

// e.g. [5, 19, 8, 1] -> 33 Total Pollution
// Applying 2 filters to `19` and 1 filter to `8` (total 3)
// reduces the total pollution to 14.75, which is less than 33 / 2.

import java.util.PriorityQueue

fun solution(factories: List<Int>): Int {
    val maxHeap = PriorityQueue<Int> { a, b -> Integer.compare(b, a) }.apply {
        factories.forEach { add(it) }
    }
    
    var count = 0
    while(maxHeap.sum() > factories.sum() / 2) {
        maxHeap.add(maxHeap.poll() / 2)
        count++
    }
    
    return count
}

listOf(
    listOf(5,19,8,1), // 3
    listOf(10,10), // 2
    listOf(3,0,5), // 2
)
    .map { solution(it) }
    .forEach(::println)
