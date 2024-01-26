package org.example

import java.util.*

class IllegalVoterException(message: String) : Throwable(message)

@Throws(IllegalVoterException::class)
fun vote(name: String, idade: Int) {
    if (idade < 16) {
        throw IllegalVoterException("$name não pode votar!")
    }
    println("Voto de $name realizado com sucesso!")
}

fun main() {

    val sc: Scanner = Scanner(System.`in`)

    print("Digite um valor: ")
    val a = 10
    print("Digite outro valor: ")
    val b = 2

    val divisao = try {
        println("Tentando fazer a divisão...")
        a / b
    } catch (e: ArithmeticException) {
        println("Divisão com erro!")
        null
    } finally {
        println("Finally!")
    }

    println(divisao)


    var quantidadeDeVotos = 0

    quantidadeDeVotos += try {
        vote("Joaquim", 33)
        1
    } catch (e: IllegalVoterException) { 0 }

    quantidadeDeVotos += try {
        vote("Maria", 15)
        1
    } catch (e: IllegalVoterException) { 0 }

    quantidadeDeVotos += try {
        vote("Renan", 50)
        1
    } catch (e: IllegalVoterException) { 0 }

    println("Quantidade de votos: $quantidadeDeVotos")


    sc.close()
}