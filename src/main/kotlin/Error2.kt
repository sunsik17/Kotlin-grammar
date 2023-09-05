sealed class Error2 {
    class FileError(val fileName: String) : Error2()
    class DatabaseError(val dbmsType: DbmsType) : Error2()
    class OsError(val osType: OsType) : Error2()
}

enum class OsType {
    WINDOWS, LINUX, MACOS
}

fun getCharacter(error: Error2) = when(error) {
    is Error2.FileError -> "Error is occurred at ${error.fileName}"
    is Error2.DatabaseError -> "Error on DBMS : ${error.dbmsType}"
    is Error2.OsError -> "Error on OS : ${error.osType}"
}