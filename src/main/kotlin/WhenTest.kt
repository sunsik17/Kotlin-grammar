import Color.*

fun main() {
    println("BLUE is ${getKoreanColorName(BLUE)}")
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