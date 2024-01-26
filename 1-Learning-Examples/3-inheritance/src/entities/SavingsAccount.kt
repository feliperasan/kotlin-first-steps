package entities

class SavingsAccount (number: Int, holder: String, balance: Double, private val interestRate: Double) : Account (number, holder, balance) {
    constructor() : this(0, "", 0.0, 0.0)

    fun updateBalance() {
        balance += balance + interestRate
    }

    override fun withdraw(amount: Double) {
        balance -= amount
    }
}