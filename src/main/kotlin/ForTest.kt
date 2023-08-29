import java.util.TreeMap

fun main() {
    for (i in 1..100) {
        println(i)
    }

    for (i in 1 until 100 step 3) {
        println(i)
    }

    for (i in 100 downTo 0 step 2) {
        println(i)
    }

    val binaryReps = TreeMap<Char, String>()

    for (c in 'A'..'Z') {
        val binary = Integer.toBinaryString(c.code)

        binaryReps[c] = binary // binaryReps의 key = c, value = binary
        // java의 map.add(c, binary) 와 같다
    }

    for ((key, value) in binaryReps) {
        println("문자 : $key, 아스키코드 : $value")
    }
    for (mapValue in binaryReps) {
        println("문자 : ${mapValue.key}, 아스키코드 : ${mapValue.value}")
    }
}

fun isLetter(c: Char) = c in 'a'..'z' || c in 'A'..'Z'

fun isNotDigit(c: Char) = c !in '0'..'9'

fun recognize(c: Char) = when(c) {
    in '0'..'9' -> "숫자"
    in 'a'..'z', in 'A'..'Z' -> "알파벳"
    else -> "숫자도 알파벳도 아님"
}