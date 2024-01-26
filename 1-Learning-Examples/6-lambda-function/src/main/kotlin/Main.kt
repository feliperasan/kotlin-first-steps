package org.example

fun main() {
    val upperCase1: (String) -> String = { str: String -> str.uppercase() }
    val upperCase2: (String) -> String = { str -> str.uppercase() }
    val upperCase3 = { str: String -> str.uppercase() }

    val upperCase4: (String) -> String = { it.uppercase() }

    val upperCase5: (String) -> String = String::uppercase

    val operationCase1: (Int, Int) -> Int = { a: Int, b:Int -> a + b }

    infix fun Int.multiply(x: Int) = this * x
    val x = 2;
    val operationCase2 = { a: Int, b:Int -> a multiply x + b}

    println(upperCase1("hello"))
    println(upperCase2("hello"))
    println(upperCase3("hello"))
    println(upperCase4("hello"))
    println(upperCase5("hello"))

    println(operationCase1(2, 2))
    println(operationCase2(2, 2))
}

