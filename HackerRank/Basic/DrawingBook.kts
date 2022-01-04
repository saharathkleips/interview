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

// Given n and p, find and print the minimum number of pages that 
// must be turned in order to arrive at page p. The book always starts
// at page one on the right-side. You must flip page by page starting
// from the front or back.

/*
 * Complete the 'pageCount' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER n
 *  2. INTEGER p
 */

fun pageCount(n: Int, p: Int): Int = minOf(
    p / 2,
    if (n % 2 == 0) (n - p + 1) / 2 else (n - p) / 2
)

fun main(/*args: Array<String>*/) {
    // val n = readLine()!!.trim().toInt()

    // val p = readLine()!!.trim().toInt()

    // val result = pageCount(n, p)

    // println(result)
    listOf(
        6 to 2, // 1
        5 to 4, // 0
        5 to 3, // 1
        6 to 6, // 0
        1 to 1, // 0
    )
        .map { (n, p) -> pageCount(n,p) }
        .onEach(::println)
}

main()

/* Notes

Not much here, the answer is just math.

*/