class Person (
    val name: String,
    val isMarried: Boolean
)

class Family (
    val familyName: String
)

class GrandFather (
    val name: String
)

class Triangle (
    val height: Int,
    val weight: Int
) {
    val isSquare : Boolean
        get() {
            return height == weight
        }
}