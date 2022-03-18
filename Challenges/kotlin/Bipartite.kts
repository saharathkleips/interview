// Determine whether a graph is bipartite.
// A graph is bipartite if every node can be divided into two independent sets such that
// every node from the first set only connects to nodes from the second set and vice versa.

fun <T> adjacencyListOf(vararg pairs: Pair<T, T>): MutableMap<T, MutableList<T>> = 
    mutableMapOf<T, MutableList<T>>().apply {
        pairs.forEach { 
            getOrPut(it.first, ::mutableListOf).add(it.second)
            getOrPut(it.second, ::mutableListOf).add(it.first)
        }
    }

enum class Color { BLUE, GREEN }

fun <T> Map<T, List<T>>.bipartite(): Boolean {
    val visited: MutableSet<Pair<T, Color>> = mutableSetOf()
    val stack: MutableList<Pair<T, Color>> = mutableListOf(keys.first() to Color.BLUE)

    while (stack.isNotEmpty()) {
        stack.removeLast().takeIf { it !in visited }?.let { (node, color) ->
            this[node]
                ?.map {
                    if (visited.contains(it to color)) return false
                    if (color == Color.BLUE) it to Color.GREEN else it to Color.BLUE
                }
                ?.forEach { stack.add(it) }
            visited.add(node to color)
        }
    }
    return true
}
