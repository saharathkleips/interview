# Enum

Define a bounded set of properties.

## Instantiate

```kotlin
enum class Shape(val id: String) {
    SQUARE("sq"),
    TRIANGLE("tri"),
    CIRCLE("circ"),
}
```

## Reverse Mapping

Associate an enum entry by one of its properties.

```kotlin
enum class Shape(val id: String) {
    ...
    ;

    companion object {
        private val idMap: Map<String, Shape> = Shape.values().associateBy(Shape::id)
        fun fromId(id: String): Shape? = idMap[id]
    }
}
```