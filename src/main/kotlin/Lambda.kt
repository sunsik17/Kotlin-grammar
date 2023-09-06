fun sum(x: Int, y: Int) = x + y

val lambdaSum = { x: Int, y: Int -> x + y }

data class Person0(val name: String, val age: Int)

val persons = listOf(
    Person0("aa", 20),
    Person0("ss", 42),
    Person0("bb", 10),
    Person0("cc", 52),
    Person0("zz", 12),
)

fun main() {
    println(sum(10, 10))
    println(lambdaSum(20, 20))
    println({ x: Int, y: Int -> x + y }(30, 30))

    // 가장 정석적인 람다 호출, 람다 수식(중괄호)를 함수 호출에 인자로 넣어줌
    println(persons.maxByOrNull({ person0: Person0 -> person0.age }))
    // 가장 마지막 인자가 람다 식이면 함수 호출 밖으로 추출 가능
    println(persons.maxByOrNull() { person0: Person0 -> person0.age })
    // 람다만 있는 경우 빈괄호 삭제 가능
    println(persons.maxByOrNull { person0: Person0 -> person0.age })
    // 컴파일러가 타입 추론
    println(persons.maxByOrNull { person0 -> person0.age })
    // 람다의 파라미터 이름을 기본 이름인 it으로 수정하면 가장 간결한 람다식이 완성
    println(persons.maxByOrNull { it.age })
}

