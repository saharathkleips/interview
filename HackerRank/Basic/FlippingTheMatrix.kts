// Sean invented a game involving a matrix where each cell of the matrix contains
// an integer. He can reverse any of its rows or columns any number of times. 
// The goal of the game is to maximize the sum of the elements in the submatrix 
// located in the upper-left quadrant of the matrix.

// Given the initial configurations for matrices, help Sean reverse the rows 
// and columns of each matrix in the best possible way so that the sum of the 
// elements in the matrix's upper-left quadrant is maximal.

/*
 * Complete the 'flippingMatrix' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts 2D_INTEGER_ARRAY matrix as parameter.
 */
fun flippingMatrix(matrix: Array<Array<Int>>): Int =
    (0..matrix.size / 2 - 1).fold(0) { outer, row ->
        (0..matrix.size / 2 - 1).fold(outer) { inner, col ->
            inner + maxOf(
                maxOf(
                    matrix[row][col], // origin
                    matrix[matrix.size - 1 - row][matrix.size - 1 - col] // flip across
                ), 
                maxOf(
                    matrix[row][matrix.size - 1 - col], // flip down
                    matrix[matrix.size - 1 - row][col] // flip right
                )
            )
        }
    }

fun main() {
    listOf(
        arrayOf(
            arrayOf(1,2),
            arrayOf(3,4),
        ), // 4
        arrayOf(
            arrayOf(112,42,114,119),
            arrayOf(56,125,101,49),
            arrayOf(15,78,56,43),
            arrayOf(62,98,83,108),
        ), // 119 + 114 + 56 + 125
    )
        .map(::flippingMatrix)
        .onEach(::println)
}

main()

/* Notes

Each element of the inner n x n matrix can only be populated by 3 other elements
regardless of how many times we flip: right, down, and across (both right and down).
The flipping will never cause elements to intersect since the overall size of the
matrix is 2n, so we can just take the max value at each element's options.

*/