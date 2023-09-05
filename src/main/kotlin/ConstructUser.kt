// 생성자 및 초기화를 가장 명시적으로 풀어쓴 버전
class User constructor(_userName: String) {
    val userName: String

    init {
        userName = _userName
    }
}

// 조금 간소화 한 버전
class User2 constructor(_userName: String) {
    val userName = _userName
}

// 실제로 가장 많이 사용되는 버전
class User3(val userName: String)

data class User4(
    val userName: String,
    val level: Int = 1
)

fun main() {
    println(User4("Jelly"))
    println(User4("Hyde", 10))
}