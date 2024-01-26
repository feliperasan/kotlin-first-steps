import entities.Account
import entities.BusinessAccount

fun main() {

    // Upcasting
    val acc1: Account = BusinessAccount(1001, "Alex", 1000.0, 500.0)
    acc1.withdraw(100.00)
    println("Balance: ${acc1.getBal()}")

    // Downcasting
    val acc2: BusinessAccount = acc1 as BusinessAccount
    acc2.withdraw(100.00)
    println("Balance: ${acc2.getBal()}")

    if (acc2 is BusinessAccount) {
        println("Depositing...")
        acc2.deposit(200.00)
        println("Update Balance: ${acc2.getBal()}")
    }

    fun testAccount(name: String?) {
        name?.let { valor -> println("Holder Account 1: ${valor.length}") }
    }

    testAccount(acc1.getHolder())

    fun test2Account(name: String?) {
        name?.run { println("Holder Account 2: $length") }
    }

    test2Account(acc2.getHolder())

    with(acc1) {
        println("Number Account 1: ${getNumber()}")
    }

    val acc3: Account = Account(1003, "Santos", 1000.00)
        .also {
            x -> println("Number Account 3: ${x.getNumber()}")
        }
}