package entities

class BusinessAccount (number: Int, holder: String, balance: Double, private var loanLimit: Double) : Account (number, holder, balance) {

    constructor() : this(0, "", 0.0, 0.0)

    fun loan(amount: Double) {
        if (amount <= loanLimit) {
            balance += amount - 10.0
        }
    }

    override fun withdraw(amount: Double) {
        super.withdraw(amount)
        balance -= 2.0
    }

}