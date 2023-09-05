open class Account2 {
    var balance: Long = 0
        private set

    var accountName: String = ""
        get() = "계좌이름 : $field"

    fun increaseBalance(value: Int) {
        if (this.balance + value > 1_000_000) throw IllegalStateException("Balance cannot be over 1 million")
        this.balance += value
    }

    fun decreaseBalance(value: Int) {
        if (this.balance - value < 0) throw IllegalStateException("Balance cannot be under 0")
        this.balance -= value
    }
}

fun main() {
    val account = Account2()

    account.accountName = "급여계좌"
    account.increaseBalance(100)
    account.increaseBalance(100)
    account.increaseBalance(100)
    account.increaseBalance(100)

    println("${account.accountName} 잔액 : ${account.balance}")
}