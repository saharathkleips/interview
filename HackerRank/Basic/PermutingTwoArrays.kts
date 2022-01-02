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

// There are two n-element arrays of integers, A and B. 
// Permute them into some A' and B' such that the relation 
// A'[i] + B'[i] >= K holds for all i where 0 <= i <= n.

// There will be Q queries consisting of A, B, and K. 
// For each query, return YES if some permutation A', B' 
// satisfying the relation exists. Otherwise, return NO.

/*
 * Complete the 'twoArrays' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts following parameters:
 *  1. INTEGER k
 *  2. INTEGER_ARRAY A
 *  3. INTEGER_ARRAY B
 */

fun twoArrays(k: Int, A: Array<Int>, B: Array<Int>): String =
    if ((A.sorted() zip B.sortedDescending()).all { (a, b) -> a + b >= k }) "YES"
    else "NO"

fun main(/*args: Array<String>*/) {
    // val q = readLine()!!.trim().toInt()

    // for (qItr in 1..q) {
    //     val first_multiple_input = readLine()!!.trimEnd().split(" ")

    //     val n = first_multiple_input[0].toInt()

    //     val k = first_multiple_input[1].toInt()

    //     val A = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    //     val B = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    //     val result = twoArrays(k, A, B)

    //     println(result)
    // }

    listOf(
        Triple(10, arrayOf(2,1,3), arrayOf(7,8,9)), // YES
        Triple(5, arrayOf(1,2,2,1), arrayOf(3,3,3,4)), // NO
        Triple(10, arrayOf(1,1,1,1), arrayOf(9,9,9,9)), // YES
        Triple(10, arrayOf(1,2,3,4), arrayOf(1,2,3,4)), // NO
    )
        .map { (k, A, B) -> twoArrays(k, A, B) }
        .onEach(::println)
}

main()

/* Notes

The idea here is to sort each list in ascending and descending orders and check if the condition
holds true at each index. Conceptually each element can only be used once, and matching a max
value to a min value ensures that there is no "waste".

*/
