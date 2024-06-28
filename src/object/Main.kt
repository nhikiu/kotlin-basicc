package `object`

import interfaceEx.A
import interfaceEx.User

class Main {
}

fun main() {
    val obj = object : A, User("Nhi") {
        override val month: Int
            get() = 20

        override fun getMonth() {
            println("$month - $name")
        }
    }
}

object impl : A {
    override val month: Int
        get() = 12

    override fun getMonth() {
        println(month)
    }
}