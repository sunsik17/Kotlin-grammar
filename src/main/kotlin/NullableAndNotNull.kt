fun main() {
    val nullablePerson0: Person0? =
        if (System.currentTimeMillis() % 2 == 0L) Person0("Even", 22)
        else null


    // if 검사 등으로 특정 역역에서는 not null 타입처럼 사용 가능
    if (nullablePerson0 != null) {
        println("짝수 시간에만 존재하는 사람의 나이는 ${nullablePerson0.age}")
    }

    // ?. 호출을 수행 : 값이 있는 경우는 호출결과, 값이 없는 경우에는 null
    println("짝수 시간에만 존재하는 사람의 나이는 ${nullablePerson0?.age}")
    // !!. 호출을 수행 : 값이 없는 경우 NPE 발생
    println("짝수 시간에만 존재하는 사람의 나이는 ${nullablePerson0!!.age}")


}

fun nullableToNotNull(s: String?): String = s ?: "Default string"