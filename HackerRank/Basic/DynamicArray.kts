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

// Problem is long, read it at: https://www.hackerrank.com/challenges/dynamic-array/problem

/*
 * Complete the 'dynamicArray' function below.
 *
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts following parameters:
 *  1. INTEGER n
 *  2. 2D_INTEGER_ARRAY queries
 */

fun dynamicArray(n: Int, queries: Array<Array<Int>>): Array<Int> {
    val lists = mutableListOf<MutableList<Int>>().apply {
        (1..n).forEach { add(mutableListOf()) }
    }
    val answer = mutableListOf<Int>()
    var lastAnswer = 0
    queries.forEach {
        val idx = it[1].xor(lastAnswer) % n
        when (it[0]) {
            1 -> lists[idx].add(it[2])
            2 -> { 
                lastAnswer = lists[idx][it[2] % lists[idx].size] 
                answer.add(lastAnswer)
            }
        }
    }
    
    return answer.toTypedArray()
}

fun main(args: Array<String>) {
    val first_multiple_input = readLine()!!.trimEnd().split(" ")

    val n = first_multiple_input[0].toInt()

    val q = first_multiple_input[1].toInt()

    val queries = Array<Array<Int>>(q, { Array<Int>(3, { 0 }) })

    for (i in 0 until q) {
        queries[i] = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
    }

    val result = dynamicArray(n, queries)

    println(result.joinToString("\n"))
}

/* Notes

A follow the steps type of problem.

*/