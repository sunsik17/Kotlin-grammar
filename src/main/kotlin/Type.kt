fun main() {
    val i = 1
    val k = 1_000_000_000_000_000
    val l: Long = i.toLong()

    printSomething()
    val persons = listOf(
        Person0("Captain", 44),
        Person0("Cyclops", 35),
        Person0("Deadpool", 31),
        Person0("Iron Man", 31),
        Person0("Iceman", 54),
        Person0("Loki", 54),
        Person0("Hulk", 54),
    )
    val name = persons.find { it.age > 55 } ?: fail("50살이 넘는 사람은 없다")

//    val list: List<Int>
//    val list: List<Int?>
//    val list: List<Int>?
//    val list: List<Int?>?

}

fun printSomething(): Unit {
    println("Void Method")
}

fun fail(message: String): Nothing {
    throw IllegalStateException(message)
}
