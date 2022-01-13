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

// Watson gives Sherlock an array of integers. His challenge is to find an element of the array such that 
// the sum of all elements to the left is equal to the sum of all elements to the right.

/*
 * Complete the 'balancedSums' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts INTEGER_ARRAY arr as parameter.
 */

fun balancedSums(arr: Array<Int>): String {
    val tail = arr.drop(1)
    val (left, right) = tail.foldIndexed(0 to tail.sum()) { index, (left, right), it ->
        if (left == right) return "YES"
        (left + arr.getOrElse(index) { 0 }) to (right - it)
    }
    
    return if (left == right) "YES" else "NO"
}

fun main(/*args: Array<String>*/) {
    // val T = readLine()!!.trim().toInt()

    // for (TItr in 1..T) {
    //     val n = readLine()!!.trim().toInt()

    //     val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    //     val result = balancedSums(arr)

    //     println(result)
    // }
    listOf(
        arrayOf(1,2,3), // NO
        arrayOf(1,2,3,3), // YES
        arrayOf(3,2,1), // NO
        arrayOf(3,3,2,1), // YES
        arrayOf(1,2,3,4,3,2,1), // YES
        arrayOf(), // YES
        arrayOf(0,0,0), // YES
    )
        .map(::balancedSums)
        .onEach(::println)
}

main()

/* Notes

The brute force way would be to calculate the sum of the left and right sublists at each index,
but we can optimize by keeping a running count of the left and right sum to solve it linearly.

*/