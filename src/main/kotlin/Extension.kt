fun String.double(add: String) = this + this + add
fun String.toInt() = Integer.parseInt(this)
fun main() {
    println("do".double(" is best"))
    println("1".toInt())
}