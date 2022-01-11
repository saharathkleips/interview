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

// Given a square grid of characters in the range ascii[a-z],
// rearrange elements of each row alphabetically, ascending.
// Determine if the columns are also in ascending alphabetical order, top to bottom.
// Return YES if they are or NO if they are not.

/*
 * Complete the 'gridChallenge' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts STRING_ARRAY grid as parameter.
 */

fun gridChallenge(grid: Array<String>): String =
    grid.map { it.toCharArray().sorted() }
        .let { sorted ->
            sorted[0].indices.map { index -> 
                (0..grid.size - 1).map { sorted[it][index] } 
            }
        }
        .all { it.joinToString("") == it.sorted().joinToString("") }
        .let { if (it) "YES" else "NO" }

fun main(/*args: Array<String>*/) {
    // val t = readLine()!!.trim().toInt()

    // for (tItr in 1..t) {
    //     val n = readLine()!!.trim().toInt()

    //     val grid = Array<String>(n, { "" })
    //     for (i in 0 until n) {
    //         val gridItem = readLine()!!
    //         grid[i] = gridItem
    //     }

    //     val result = gridChallenge(grid)

    //     println(result)
    // }

    listOf(
        arrayOf("abc", "def", "ghi"), // YES
        arrayOf("ghi", "def", "abc"), // NO
        arrayOf("abc", "ade", "efg"), // YES
        arrayOf("ebacd", "fghij", "olmkn", "trpqs", "xywuv"), // YES
        arrayOf("zzzz", "yyyy", "xxxx"), // NO
    )
        .map(::gridChallenge)
        .onEach(::println)
}

main()

/* Notes

This implementation is pretty rudimentary. The idea to is sort the
grid and then match each column to the sorted column. I can't really
think of a more optional solution.

*/
