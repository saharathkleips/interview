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

// A pangram is a string that contains every letter of the alphabet. 
// Given a sentence determine whether it is a pangram in the English alphabet. 
// Ignore case. Return either pangram or not pangram as appropriate.

/*
 * Complete the 'pangrams' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts STRING s as parameter.
 */

fun pangrams(s: String): String =
    if ("abcdefghijklmnopqrstuvwxyz".all { it in s || it.uppercaseChar() in s }) "pangram"
    else "not pangram"

fun main(/*args: Array<String>*/) {
    // val s = readLine()!!

    // val result = pangrams(s)

    // println(result)

    listOf(
        "abcdefghijklmnopqrstuvwxyz", // pengram
        "ABCDEFGHIJKLMNOPQRSTUVWXYZ", // pengram
        "", // not pengram
        "a", // not pengram
        "The quick brown fox jumps over the lazy dog.", // pengram
    )
        .map(::pangrams)
        .onEach(::println)
}

main()

/* Notes

There might be a way to do this using a regex?
`Char::toUpperCase` is deprecated in favor of `Char::uppercaseChar`.

*/