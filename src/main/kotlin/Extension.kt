fun String.double(add: String) = this + this + add
fun String.toInt() = Integer.parseInt(this)
infix fun String.add(postfix: String) = this + postfix
infix fun String.equalTo(expected: String) = this == expected
fun main() {
    println("do".double(" is best"))
    println("1".toInt())
    println("do" add " while")
    println("do" equalTo "do")
}