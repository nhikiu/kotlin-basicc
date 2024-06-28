package utils

import interfaceEx.User

fun main() {
    val user = User("Nhi")
    user.printName()
    user.printNameNullable()
    println(user.age)
    User.printCompanion()
    println(User.nameCompanion)

    // infix function: Cho phép viết dưới dạng trung tố
    1 plus 2
}

fun User.printName() {
    println("Name: ${this.name}")
}

fun User?.printNameNullable() {
    if (this == null) {
        return
    }
    printName()
}

val User.age get() = 10

fun User.Companion.printCompanion() {
    println("User companion")
}

val User.Companion.nameCompanion get() = "Companion name"

class Person {
    fun User.printInfor() {
        // toString of User
        toString()

        // toString of Person
        this@Person.toString()
    }
}

// Infix function
infix fun Int.plus(a: Int) : Int {
    return this + a
}