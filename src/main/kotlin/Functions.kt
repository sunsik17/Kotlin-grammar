val set = setOf(1, 2, 3, 3)
val list = listOf("a", "c", "b")
val map = mapOf(
    1 to "One",
    2 to "Two",
    3 to "Three"
)
fun getMyName(
    firstName: String = "foo",
    lastName: String = "bar"
): String = "$firstName $lastName"
fun main() {
    println(set.javaClass)
    println(set)
    println(list.javaClass)
    println(list)
    println(list.sorted())
    println(map.javaClass)
    println(map)

    println(getMyName("Steve", "Jobs"))
    println(getMyName("Jobs", "Steve"))
    println(getMyName(firstName = "Steve", lastName = "Jobs"))
    println(getMyName(lastName = "Jobs", firstName = "Steve"))
    println(getMyName("Steve"))
    println(getMyName(lastName = "Jobs"))
}