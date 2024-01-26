package org.example

fun main() {

    infix fun Int.times(s: String) = s.repeat(this)
    print(2 times "Bye ")

    infix fun Double.soma(n: Double) = this + n
    println(10.0 soma 20.0)

    val p2 = Person("Maria")
    val p1 = Person("Sofia")

    println(p1 likes p2)

    val x = 3 plusPlus 4
    println(x)

}

class Person (val name: String){
    var likePersons: MutableList<Person> = mutableListOf()
    infix fun likes(other: Person) = likePersons.add(other)
}

infix fun Int.plusPlus(other: Int) = this + other + 1