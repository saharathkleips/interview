# Memoization

Cache the result of an expensive operation by the parameters used to calculate that result. Subsequent calls to a memoized function will simply return the cached value.

## Instantiate

The following class can be used to memoize single-parameter functions, but might need to be adjusted based on the characteristics of the parameter.

```kotlin
class Memoize<in In, out Out>(private val fn: (In) -> Out): (In) -> Out {
    private val memos: MutableMap<In, Out> = mutableMapOf()
    override operator fun invoke(input: In): Out = memos.getOrPut(input) { fn(input) }
}
```

## Usage

Replace invocations with the memoized version.

```kotlin
val memoizedFactorial: (Int) -> Long = Memoize(::factorial)

fun factorial(int: Int): Long = 
    if (int >= 1) int * memoizedFactorial(int - 1)
    else 1
```
