interface Error

class FileError(val fileName: String) : Error
class DatabaseError(val dbmsType: DbmsType) : Error

enum class DbmsType {
    MARIADB, MYSQL, ORACLE, H2
}

fun getCharacter(error: Error) = when (error) {
    is FileError -> "Error is occurred at ${error.fileName}"
    is DatabaseError -> "Error is occurred at ${error.dbmsType}"
    else -> throw IllegalArgumentException("Unknown error type")
}