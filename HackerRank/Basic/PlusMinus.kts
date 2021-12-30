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

// Given an array of integers, calculate the ratios of its elements that are positive, negative, and zero. 
// Print the decimal value of each fraction on a new line with  places after the decimal.

/*
 * Complete the 'plusMinus' function below.
 *
 * The function accepts INTEGER_ARRAY arr as parameter.
 */

fun plusMinus(arr: Array<Int>): Unit {
    arr.groupBy { if(it < 0) -1 else if (it > 0) 1 else 0 }
        .let {
            println(it[1]?.let { it.size.toDouble() / arr.size } ?: 0)
            println(it[-1]?.let { it.size.toDouble() / arr.size } ?: 0)
            println(it[0]?.let { it.size.toDouble() / arr.size} ?: 0)
        }
}

fun main(/*args: Array<String>*/) {
    // val n = readLine()!!.trim().toInt()

    // val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    // plusMinus(arr)

    listOf(
        arrayOf(-2,-1,0,0,1,2), // 2/6, 2/6, 2/6
        arrayOf(-1,0,0,1,2,3), // 3/6, 1/6, 2/6
        arrayOf(-1), // 0, 1, 0
        arrayOf(0), // 0, 0, 1
        arrayOf(1), // 1, 0, 0
        arrayOf(0,0,1,1)
    ).forEach(::plusMinus)
}

main()

/* Notes

We have to make sure to think about edge cases with null pointer exceptions now. 
e.g. Do not use `!!` and assume the input!

Run time is O(n) to `groupBy`. We can't get any faster since we have to check each element.

*/