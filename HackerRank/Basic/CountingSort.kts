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

// Given a list of integers, count and return the number of times each value appears as an array of integers.
// Always return a frequency array with 100 elements.

/*
 * Complete the 'countingSort' function below.
 *
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts INTEGER_ARRAY arr as parameter.
 */

fun countingSort(arr: Array<Int>): Array<Int> {
    val frequency = mutableListOf<Int>().apply { repeat(100) { add(0) }}
    
    return arr.fold(frequency) { acc, it ->
        acc.apply { set(it, get(it) + 1) }
    }.toTypedArray()
}

fun main(/*args: Array<String>*/) {
    // val n = readLine()!!.trim().toInt()

    // val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    // val result = countingSort(arr)

    // println(result.joinToString(" "))

    listOf(
        arrayOf(1,2,3), // [0, 1, 1, 1, ...]
        arrayOf(0,1,1), // [0, 2, 0, 0, ...]
        arrayOf(0,2,2,1), // [0, 1, 2, 0, ...]
    )
        .map(::countingSort)
        .map { it.toList() }
        .onEach(::println)
}

main()

/* Notes

Not sure if there's a better way to initialize the list. If it's sparse it could be a map of
index to count.

*/