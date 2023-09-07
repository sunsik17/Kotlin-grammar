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

    /**
     * 특정 값에 대해 사용 영역을 명확히 하기 위해 사용
     * 객체 참조 : this
     * 응답 : 람다식 결과
     */
    with(persons[1]) {
        println(age)
        println(name)
    }

    /**
     * 객체의 값을 한번에 여러개 설정하는 경우
     * 객체 참조 : this
     * 응답 : 객체 자신
     */
    persons[2].apply {
        this.name = "newName"
        this.age = 72
    }

    /**
     * nullable한 값을 확인하여 not null인 경우 실행하는데 주로 사용
     * 객체 참조 : it
     * 응답 : 람다식 결과
     */
    persons.filter { it.age > 60 }?.let {
        println("==나이 60이 넘는 사람 리스트==")
        println(it)
        println("========================")
    }

    /**
     * 추가적인 효과를 적용하기 위해 주로 사용
     * 객체 참조 : it
     * 응답 : 객체 자신
     */
    persons.also {
        if (persons.size < 5) throw IllegalStateException("persons의 크기가 너무 작음")
        println("persons를 모두 완성했다 이젠 뭐하지?")
    }

    /**
     * 객체의 값 설정, 추가적인 연산 진행에 사용
     * 객체 참조 : this
     * 응답 : 람다식 결과
     */
    persons.run {
        println(this.map { "${it.name}'s age : ${it.age}" })
        println(this.map { "${it.name}의 나이는 ${it.age}세" })
    }
}