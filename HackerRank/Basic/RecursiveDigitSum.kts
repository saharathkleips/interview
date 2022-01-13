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

// We define super digit of an integer x using the following rules:
// Given an integer, we need to find the super digit of the integer.
// If x has only 1 digit, then its super digit is x.
// Otherwise, the super digit of x is equal to the super digit of the sum of the digits of x.

/*
 * Complete the 'superDigit' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. STRING n
 *  2. INTEGER k
 */

fun superDigit(n: String, k: Int): Int {
    tailrec fun calculate(num: String, times: Int): Int = 
        if (num.length == 1) num.toInt()
        else calculate((num.map { it.digitToInt().toLong() }.sum() * times).toString(), 1)

    return calculate(n, k)
}

fun main(/*args: Array<String>*/) {
    // val first_multiple_input = readLine()!!.trimEnd().split(" ")

    // val n = first_multiple_input[0]

    // val k = first_multiple_input[1].toInt()

    // val result = superDigit(n, k)

    // println(result)
    listOf(
        "123" to 1, // 6
        "123" to 2, // 3
        "123" to 3, // 9
        "99" to 1, // 9
        "99" to 2, // 9
        "148" to 3, // 3
        "9875" to 4, // 8
        "123" to 3, // 9
    )
        .map { (n, k) -> superDigit(n, k) }
        .onEach(::println)
}

main()

/* Notes

This one had the added complexity of being very long, so there were a couple of things we
needed to handle for these edge cases. The first important one is we need to sum to a long.
The second one is identifying that the superDigit of the first iteration can be multiplied
by k rather than doing something like String::repeat.

*/