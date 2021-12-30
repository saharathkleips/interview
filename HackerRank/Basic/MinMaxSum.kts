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

// Given five positive integers, find the minimum and maximum values that can be calculated 
// by summing exactly four of the five integers. Then print the respective minimum and maximum 
// values as a single line of two space-separated long integers.

/*
 * Complete the 'miniMaxSum' function below.
 *
 * The function accepts INTEGER_ARRAY arr as parameter.
 */

fun miniMaxSum(arr: Array<Int>): Unit {
    arr.sorted().let {
        println("${it.take(4).map(Int::toLong).sum()} ${it.takeLast(4).map(Int::toLong).sum()}")
    }
}

fun main(/*args: Array<String>*/) {

    // val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    listOf(
        arrayOf(1,2,3,4,5,6), // 10 18
        arrayOf(-1,-2,-3,-4,-5,-6), // -18 -10
        arrayOf(-2,-2,2,2), // 0 0
        arrayOf(1,1,1,1), // 4 4
        arrayOf(1,1,1,1,2,2,2,2), // 4 8
    ).forEach(::miniMaxSum)

    // miniMaxSum(arr)
}

main()

/* Notes

This is technically not the most optimal way, but not the naive way (several for-loops).
We can sort the list and take the first four for the min-sum and the last four for the max-sum.
The time complexity for this is O(nlogn).

An O(n) way would be to iterate the list once and store the four max / min, checking at
each element. There's not a great way (code-wise) that I know of to set the "max size"
of a PriorityQueue (heap) and I didn't want to write the code for it.

*/