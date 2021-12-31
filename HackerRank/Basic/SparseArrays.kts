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

// There is a collection of input strings and a collection of query strings. 
// For each query string, determine how many times it occurs in the list of input strings. 
// Return an array of the results.

/*
 * Complete the 'matchingStrings' function below.
 *
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts following parameters:
 *  1. STRING_ARRAY strings
 *  2. STRING_ARRAY queries
 */

fun matchingStrings(strings: Array<String>, queries: Array<String>): Array<Int> =
    strings.groupingBy { it }.eachCount().let { groups ->
        queries.map { groups.getOrDefault(it, 0) }
    }
    .toTypedArray()


fun main(/*args: Array<String>*/) {
    // val stringsCount = readLine()!!.trim().toInt()

    // val strings = Array<String>(stringsCount, { "" })
    // for (i in 0 until stringsCount) {
    //     val stringsItem = readLine()!!
    //     strings[i] = stringsItem
    // }

    // val queriesCount = readLine()!!.trim().toInt()

    // val queries = Array<String>(queriesCount, { "" })
    // for (i in 0 until queriesCount) {
    //     val queriesItem = readLine()!!
    //     queries[i] = queriesItem
    // }

    // val res = matchingStrings(strings, queries)

    // println(res.joinToString("\n"))

    listOf(
        arrayOf("aba", "baba", "aba", "xzxb") to 
            arrayOf("aba", "xzxb", "ab"), // 2, 1, 0
        arrayOf("def", "de", "fgh") to 
            arrayOf("de", "lmn", "fgh"), // 1, 0, 1
        arrayOf("abcde","sdaklfj","asdjf","na","basdn","sdaklfj","asdjf","na","asdjf","na","basdn","sdaklfj","asdjf") to 
            arrayOf("abcde", "sdaklfj", "asdjf", "na", "basdn"), // 1, 3, 4, 3, 2
    ).map { (strings, queries) ->
        matchingStrings(strings, queries).toList()
    }.onEach(::println)
}

main()

/* Notes

Best we can do is O(n * m) since we have to visit every element. Kotlin provides an easy way
to group by the frequency of each element by doing `groupingBy { it }.eachCount()`.

*/