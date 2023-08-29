import java.io.IOException

fun parse(str: String) = try {
    Integer.parseInt(str)
} catch (e: Exception) {
    throw IOException("일부러 발생시키는 checked exception")
} finally {
    println("무조건 실행되는 코드 블록")
}