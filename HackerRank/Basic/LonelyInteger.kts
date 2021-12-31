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

// Given an array of integers, where all elements but one occur twice, find the unique element.

/*
 * Complete the 'lonelyinteger' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts INTEGER_ARRAY a as parameter.
 */

fun lonelyinteger(a: Array<Int>): Int =
    a.groupingBy { it }.eachCount().let { groups ->
        groups.entries.firstOrNull { it.value == 1 }?.let { it.key } ?: 0
    }

fun main(/*args: Array<String>*/) {
    // val n = readLine()!!.trim().toInt()

    // val a = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    // val result = lonelyinteger(a)

    // println(result)
    listOf(
        arrayOf(1), // 1
        arrayOf(1, 1, 2), // 2
        arrayOf(0, 0, 1, 2, 1), // 2
    )
        .map(::lonelyinteger)
        .onEach(::println)
}

main()