class Account() {
    var balance: Long = 0
        set(value) {
            if (value < 0) throw IllegalStateException("잔액은 0원 이상이어야 합니다.")

            field = value
        }

    var accountName: String = ""
        get() = "계좌이름 : $field"
}

fun main() {
    val account = Account()
    account.balance = 100
    account.accountName = "급여계좌"

    println("${account.accountName} 잔액 : ${account.balance}")
}