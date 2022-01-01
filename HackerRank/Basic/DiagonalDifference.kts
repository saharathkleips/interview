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
import kotlin.math.abs

// Given a square matrix, calculate the absolute difference between the sums of its diagonals.

/*
 * Complete the 'diagonalDifference' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts 2D_INTEGER_ARRAY arr as parameter.
 */

fun diagonalDifference(arr: Array<Array<Int>>): Int {
    val (left, right) = (0..arr.size - 1).fold(0 to 0) { (left, right), col ->
        left + arr[col][col] to right + arr[arr.size - col - 1][col]
    }
    
    return abs(left - right)
}

fun main(/*args: Array<String>*/) {
    // val n = readLine()!!.trim().toInt()

    // val arr = Array<Array<Int>>(n, { Array<Int>(n, { 0 }) })

    // for (i in 0 until n) {
    //     arr[i] = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
    // }

    // val result = diagonalDifference(arr)

    // println(result)

    listOf(
        arrayOf(
            arrayOf(1, 2),
            arrayOf(2, 1),
        ), // 2
        arrayOf(
            arrayOf(1, 0),
            arrayOf(0, 1),
        ), // 2
        arrayOf(
            arrayOf(0, 1),
            arrayOf(1, 0),
        ), // 2
        arrayOf(
            arrayOf(1, 1),
            arrayOf(1, 1),
        ), // 0
        arrayOf(
            arrayOf(1, 1, 2),
            arrayOf(1, 3, 1),
            arrayOf(2, 1, 1),
        ), // 2
    )
        .map(::diagonalDifference)
        .onEach(::println)
}

main()

/* Notes

Absolute value is in `kotlin.math` and is not automatically imported by HackerRank.

*/