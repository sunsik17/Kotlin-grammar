sealed class Person (
    val name: String,
    val isMarried: Boolean
)

class Developer(
    name: String,
    isMarried: Boolean,
    val language: String
) : Person(
    name, isMarried
)

class Marketer(
    name: String,
    isMarried: Boolean,
    val division: Division
) : Person(
    name, isMarried
)

enum class Division{
    CONTENTS, DIGITAL, BRAND
}

fun getSpecialSkill(person: Person) =
    when(person) {
        // smart cast 덕분에 Developer로 추가 형변환 없이 language 프로퍼티 사용 가능
        is Developer -> person.language
        // smart cast 덕분에 Marketer로 추가 형변환 없이 division 프로퍼티 사용 가능
        is Marketer -> person.division
    }


class Rectangle (
    val height: Int,
    val weight: Int
) {
    val isSquare : Boolean
        get() {
            return height == weight
        }
}