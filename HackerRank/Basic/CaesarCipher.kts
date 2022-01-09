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

// Julius Caesar protected his confidential information by encrypting it using a cipher. 
// Caesar's cipher shifts each letter by a number of letters. 
// If the shift takes you past the end of the alphabet, 
// just rotate back to the front of the alphabet. 
// In the case of a rotation by 3, w, x, y and z would map to z, a, b and c.

/*
 * Complete the 'caesarCipher' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts following parameters:
 *  1. STRING s
 *  2. INTEGER k
 */

fun caesarCipher(s: String, k: Int): String {
    fun decode(char: Char): Char {
        val alphabet = "abcdefghijklmnopqrstuvwxyz"
        return alphabet.indexOf(char.lowercaseChar())
            .takeIf { it >= 0 }
            ?.let { alphabet[(it + k) % 26] }
            ?.let { if (char.isUpperCase()) it.uppercaseChar() else it }
            ?: char
    }
    
    return s.map(::decode).joinToString("")
}

fun main(/*args: Array<String>*/) {
    // val n = readLine()!!.trim().toInt()

    // val s = readLine()!!

    // val k = readLine()!!.trim().toInt()

    // val result = caesarCipher(s, k)

    // println(result)
    listOf(
        "abc" to 0, // abc
        "abc" to 26, // abc
        "abc" to 1, // bcd 
        "abc-ABC" to 2, // cde-CDE
        "" to 15, // ""
        "abc" to 25, // zab
        "middle-Outz" to 2, // okffng-Qwvb
        "Always-Look-on-the-Bright-Side-of-Life" to 5, // Fqbfdx-Qttp-ts-ymj-Gwnlmy-Xnij-tk-Qnkj
    )
        .map { (s, k) -> caesarCipher(s, k) }
        .onEach(::println)
}

main()

/* Notes

This one relies on using modulo for wrapping. We have to be careful because
of some edge cases though, like character casing and symbols.

*/