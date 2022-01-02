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

// Two children, Lily and Ron, want to share a chocolate bar. Each of the squares has an integer on it.

// Lily decides to share a contiguous segment of the bar selected such that:
// The length of the segment matches Ron's birth month, and,
// The sum of the integers on the squares is equal to his birth day.

// Determine how many ways she can divide the chocolate.

/*
 * Complete the 'birthday' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER_ARRAY s
 *  2. INTEGER d
 *  3. INTEGER m
 */

fun birthday(s: Array<Int>, d: Int, m: Int): Int = 
    s.toList()
        .windowed(size = m)
        .count { it.sum() == d }

fun main(/*args: Array<String>*/) {
    // val n = readLine()!!.trim().toInt()

    // val s = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    // val first_multiple_input = readLine()!!.trimEnd().split(" ")

    // val d = first_multiple_input[0].toInt()

    // val m = first_multiple_input[1].toInt()

    // val result = birthday(s, d, m)

    // println(result)

    listOf(
        Triple(arrayOf(1,2,1,3,2), 3, 2), // 2
        Triple(arrayOf(1,1,1,1,1,1), 3, 2), // 0
        Triple(arrayOf(4), 4, 1), // 1
    )
        .map { (s, d, m) -> birthday(s,d,m) }
        .onEach(::println)
}

main()

/* Notes

This is just a windowing problem. Once we create the continguous windows of the
proper size, we can just check if the condition is true.

*/