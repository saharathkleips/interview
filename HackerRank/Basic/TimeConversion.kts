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

// Given a time in 12-hour AM/PM format, convert it to military (24-hour) time.
// Note: - 12:00:00AM on a 12-hour clock is 00:00:00 on a 24-hour clock.
//       - 12:00:00PM on a 12-hour clock is 12:00:00 on a 24-hour clock.

/*
 * Complete the 'timeConversion' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts STRING s as parameter.
 */

fun timeConversion(s: String): String {
    val regex = Regex("""(\d\d):(\d\d):(\d\d)(AM|PM)""")
    val (hours, minutes, seconds, period) = regex.find(s)!!.destructured
    
    return (if (period == "AM") 0 else 12)
        .let { 
            val newHours = (it + hours.toInt() % 12).toString().padStart(2, '0')
            "$newHours:$minutes:$seconds" 
        }
}

fun main(/*args: Array<String>*/) {
    // val s = readLine()!!

    // val result = timeConversion(s)

    // println(result)
    
    listOf(
        "12:00:00AM",
        "12:00:00PM",
        "11:59:59AM",
        "11:59:59PM",
        "01:01:01AM",
        "12:59:59PM",
        "12:59:59AM",
        "04:23:23AM",
        "10:11:12PM",
    ).map { timeConversion(it) }.onEach(::println)
}

main()

/* Notes

I'm pretty sure there's a stdlib for this? But I think the spirit of the problem
was the use `%` modulo. The minutes / seconds don't change in the 24-hour format
so we can just ignore those.

There's an edge case here with the hour formatting, converting an `Int` to a `String`
will cause `1` to become `"1"` rather than `"01"`, so we need to `padStart`.

*/