fun main() {
    println("Hello World")
    println(max(1, 2))
    println(max2(2, 3))
    println(max3(2, 4))
}
fun max(a: Int, b: Int): Int {
    return if (a > b) a else b
}
fun max2 (a: Int, b: Int) : Int = if (a > b) a else b
fun max3 (a: Int, b: Int) = if (a > b) a else b