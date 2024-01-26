package entities

open class Account (private val number: Int, private var holder: String, protected var balance: Double) {

    constructor() : this(0, "", 0.0)

    fun getNumber(): Int {
        return this.number
    }

    fun getHolder(): String {
        return this.holder
    }

    fun setHolder(holder: String) {
        this.holder = holder
    }

    fun getBal(): Double {
        return this.balance
    }

    open fun deposit(amount: Double) {
        this.balance += amount
    }

    open fun withdraw(amount: Double) {
        this.balance -= amount + 5.0
    }
}