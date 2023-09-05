open class Parent(
    val familyName: String
)

class Child(
    val subName: String,
    familyName: String
) : Parent(familyName)