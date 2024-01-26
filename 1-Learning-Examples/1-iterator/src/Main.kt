fun main() {
    for (i in 0..3) {
        print(i)
    }

    print(" ")

    for (i in 0 until 3) {
        print(i)
    }

    print(" ")

    for (i in 2..8 step 2) {
        print(i)
    }

    print(" ")

    for (i in 3 downTo 0) {
        print(i)
    }

    print(" ")

    for (i in 'a'..'f') {
        print(i)
    }

    print(" ")

    for (i in 'z' downTo 'c') {
        print(i)
    }

    print(" ")

    val x = 2
    if (x in 1..10) {
        print(x)
    }

    if (x !in 1..10) {
        print(x)
    }

    print(" ")

    fun max(a: Int, b: Int): Int = if (a > b ) a else b

    print(max(10, 5))
}