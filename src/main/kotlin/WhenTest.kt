import Color.*

fun main() {
    println("BLUE is ${getKoreanColorName(BLUE)}")

    val developer = Developer("순식", false, "Kotlin")
    val marketer = Marketer("상훈", false, Division.BRAND)

    println("순식's special skill is ${getSpecialSkill(developer)}")
    println("상훈's special skill is ${getSpecialSkill(marketer)}")
}

enum class Color {
    RED, GREEN, BLUE, GRAY
}

fun getKoreanColorName(color: Color): String = when (color) {
    RED -> "빨강"
    GREEN -> "초록"
    BLUE -> "파랑"
    GRAY -> "회색"
}