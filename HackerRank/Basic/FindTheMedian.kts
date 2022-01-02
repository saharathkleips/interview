// The median of a list of numbers is essentially its middle element after sorting.
// The same number of elements occur after it as before.
// Given a list of numbers with an odd number of elements, find the median.

/*
 * Complete the 'findMedian' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts INTEGER_ARRAY arr as parameter.
 */
fun findMedian(arr: Array<Int>): Int = arr.sorted().let { it[it.size / 2] }

fun main() {
    listOf(
        arrayOf(3,1,1,2,2), // 2
        arrayOf(1,3,2), // 2
        arrayOf(1,1,1), // 1
        arrayOf(1), // 1
    )
        .map(::findMedian)
        .onEach(::println)
}

main()

/* Notes

This one is probably the most naive way to find the median. We could accomplish this
in O(n) time by just keeping track of the median as we iterate the list however.

In the scenario where we want to keep adding numbers to the list, then keeping the list
sorted would make our insertions O(n) and constant time to find the median.

There's an even better way however to get O(logn) insertion, which is to utilize a
min-heap AND a max-heap. Track the median by keeping the min and max heaps balanced
by size at the median.

*/