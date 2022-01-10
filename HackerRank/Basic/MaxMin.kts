import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

// You will be given a list of integers, arr, and a single integer k. 
// You must create an array of length k from elements of arr such that its unfairness is minimized.
// Call that array arr'. Unfairness of an array is calculated as `max(arr') - min(arr')`
// Where:
// - max denotes the largest integer in arr'
// - min denotes the smallest integer in arr'

/*
 * Complete the 'maxMin' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER k
 *  2. INTEGER_ARRAY arr
 */

fun maxMin(k: Int, arr: Array<Int>): Int =
    arr.sorted()
        .windowed(k) { it.last() - it.first() }
        .minOrNull()
        ?: 0

fun main(/*args: Array<String>*/) {
    // val n = readLine()!!.trim().toInt()

    // val k = readLine()!!.trim().toInt()

    // val arr = Array<Int>(n, { 0 })
    // for (i in 0 until n) {
    //     val arrItem = readLine()!!.trim().toInt()
    //     arr[i] = arrItem
    // }

    // val result = maxMin(k, arr)

    // println(result)
    listOf(
        3 to arrayOf(10, 100, 300, 200, 1000, 20, 30), // 20
        4 to arrayOf(1, 2, 3, 4, 10, 20, 30, 40, 100, 200), // 3
        2 to arrayOf(1, 2, 1, 2, 1), // 0
    )
        .map { (k, arr) -> maxMin(k, arr) }
        .onEach(::println)
}

main()

/* Notes

The trick here is that we can sort the list first since the minimum difference between
the max number and the min number in the sublist will always be consecutive numbers.

After sorting, since any combination of elements is possible, the problem turns into
a `windowed` problem.

*/