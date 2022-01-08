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

// Two players are playing a game of Tower Breakers! Player 1 always moves first, 
// and both players always play optimally. The rules of the game are as follows:

// Initially there are n towers.
// Each tower is of height m.
// The players move in alternating turns.
// In each turn, a player can choose a tower of height x and reduce its height to y, 
// where 1 <= Y <= X and Y evenly divides X.
// If the current player is unable to make a move, they lose the game.
// Given the values of N and M, determine which player will win. 
// If the first player wins, return 1. Otherwise, return 2.

/*
 * Complete the 'towerBreakers' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER n
 *  2. INTEGER m
 */

fun towerBreakers(n: Int, m: Int): Int =
    if (m == 1) 2
    else if (n % 2 == 1) 1
    else 2

fun main(/*args: Array<String>*/) {
    // val t = readLine()!!.trim().toInt()

    // for (tItr in 1..t) {
    //     val first_multiple_input = readLine()!!.trimEnd().split(" ")

    //     val n = first_multiple_input[0].toInt()

    //     val m = first_multiple_input[1].toInt()

    //     val result = towerBreakers(n, m)

    //     println(result)
    // }
    listOf(
        2 to 2, // 2
        1 to 4, // 1
    )
        .map { (n, m) -> towerBreakers(n, m) }
        .onEach(::println)
}

main()

/** Notes

We don't acually need to "play" the game since we can reduce the game state
to a couple of different scenarios and determine the victor for each.

*/