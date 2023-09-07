fun sum(x: Int, y: Int) = x + y

val lambdaSum = { x: Int, y: Int -> x + y }

data class Person0(var name: String, var age: Int)

val persons = listOf(
    Person0("Captain", 44),
    Person0("Cyclops", 35),
    Person0("Deadpool", 31),
    Person0("Iron Man", 31),
    Person0("Iceman", 54),
    Person0("Loki", 54),
    Person0("Hulk", 54),
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

    println(persons.maxByOrNull(Person0::age))

    /**
     * 가장 기초가 되는 함수
     * filter -> 데이터를 필터링
     * map -> 데이터를 다른 데이터르 변환(매핑)
     * 다른 복잡한 함수들도 이것들을 활용해서 만듬
     *
     *
     * all : 모두 조건에 만족하는지
     * any : 하나라도 조건에 만족하는지
     * count : 조건에 맞는 원소의 개수를 구함
     * find : 조건에 맞는 원소를 하나만 주거나 없으면 Null을 반환
     *
     * 일반 컬렉션: 모두 map을 진행한 후 find를 수행
     * sequence :
     *  - 개별 원소마다 map과 find를 진행
     *  - find에서 조건이 맞는 원소를 찾는 즉시 더이상의 연산을 수행하지 않음
     * 대량의 원소에서 필터링이나 find를 수행할 때 활용하면 더 좋을 수 있음
     */

    // age가 20 초과인 사람들만 filtering
    println(persons.filter { it.age > 40 })
    println(persons.count() { it.age > 40 })
    println(persons.all { it.age == 20 })

    // age가 20 초과인 사람들만 filtering 후 String으로 mapping(변환)
    println(persons.filter { it.age > 40 }
        .map { "${it.name}'s age is ${it.age}" })

    println(persons.groupBy {
        it.age
    })

    println(
        persons.map {
            println(it)
            it.name
        }.find { it.startsWith("I") }
    )

    println(
        persons.asSequence()
            .map {
                println(it)
                it.name
            }.find { it.startsWith("I") }
    )
}

