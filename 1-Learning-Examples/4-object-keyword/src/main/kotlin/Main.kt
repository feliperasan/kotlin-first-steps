package org.example

fun rentPrice(standardDays: Int, festivityDays: Int, specialDays: Int): Unit {

    // Object expression
    val dayRates = object {
        var standard: Int = 30 * standardDays
        var festivity: Int = 50 * festivityDays
        var special: Int = 100 * specialDays
    }

    val total = dayRates.standard + dayRates.festivity + dayRates.special

    println("Total Price: $ $total")
}

// Object declaration
object DoAuth {
    fun takeParams(username: String, password: String) {
        println("input Auth parameters = $username:$password")
    }
}

// Companion object
class BigBen {
    companion object Bonger {
        fun getBongs(nTimes: Int) {
            for (i in 1 .. nTimes) {
                print("BONG!")
            }
        }
    }
}

fun main() {
    rentPrice(10, 2, 1)

    DoAuth.takeParams("foo", "qwerty")

    BigBen.Bonger.getBongs(12)
}