package org.example

val systemUsers: MutableList<Int> = mutableListOf(1, 2, 3)
val sudoers: List<Int> = systemUsers

val openIssues: MutableSet<String> = mutableSetOf("Unique1", "Unique2", "Unique3")

fun addSystemUsers(newUser: Int) {
    systemUsers.add(newUser)
}

fun getSysSudoers(): List<Int> {
    return sudoers
}

fun addIssues(uniqueDesc: String): Boolean {
    return openIssues.add(uniqueDesc)
}

fun getStatusLog(isAdded: Boolean): String {
    return if (isAdded) "Added" else "Not Added"
}

fun main() {

    val aNewIssue: String = "Unique4"
    val anIssueAlreadyIn: String = "Unique2"
    println(getStatusLog(addIssues(aNewIssue)))
    println(getStatusLog(addIssues(anIssueAlreadyIn)))

    addSystemUsers(4)
    println(getSysSudoers())

    getSysSudoers().forEach { i -> println(i) }
}