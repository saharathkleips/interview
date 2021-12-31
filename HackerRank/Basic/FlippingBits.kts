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

// You will be given a list of 32 bit unsigned integers. 
// Flip all the bits ( and ) and return the result as an unsigned integer.

/*
 * Complete the 'flippingBits' function below.
 *
 * The function is expected to return a LONG_INTEGER.
 * The function accepts LONG_INTEGER n as parameter.
 */

fun flippingBits(n: Long): Long = n.toString(2)
    .padStart(32, '0')
    .map { if (it == '0') '1' else '0' }
    .joinToString("")
    .toLong(2)

fun main(/*args: Array<String>*/) {
    // val q = readLine()!!.trim().toInt()

    // for (qItr in 1..q) {
    //     val n = readLine()!!.trim().toLong()
        
    //     val result = flippingBits(n)

    //     println(result)
    // }
    listOf(
        1L, // 4294967294
        0L, // 4294967295
        2147483647L, // 2147483648
    )
        .map(::flippingBits)
        .onEach(::println)
}

main()

/* Notes

We can't use `Long::inv` since it does twos-compliment and the values are unsigned.
There's probably a combination of bitwise operations that will get us the flipped bits
in constant time, but we can convert the Long to a String and do the flipping linearly.
We have to be mindful of padding the string with zeros to get the correct result.

*/