fun main() {
    val persons = listOf(
        Person0("Captain", 44),
        Person0("Cyclops", 35),
        Person0("Deadpool", 31),
        Person0("Iron Man", 31),
        Person0("Iceman", 54),
        Person0("Loki", 54),
        Person0("Hulk", 54),
    )

    persons[0].let {
        println(it)
        println("첫번째 사람의 나의 ${it.age}")
    }

    with(persons[1]) {
        println(age)
        println(name)
    }
}