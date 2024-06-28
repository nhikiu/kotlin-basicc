package interfaceEx

class Main {
}

open class Company

interface A {
    val year: Int get() = 2024
    val month: Int
    val day: Int get() = 10

    fun getMonth()

    fun getYear() {
        println("Year")
    }
}

interface B {
    fun getYear() {
        println("Year B")
    }
}

abstract class Person(name: String) : Company() {
    open val name: String
    abstract val age: Int

    init {
        this.name = name
    }

    abstract fun getInfor()

    open fun getName() {
        println("Name: $name")
    }

    companion object {
        val country = "Viet Nam"
    }
}

class User(name: String) : Person(name), A, B {
    override val age: Int
        get() = 20

    override fun getInfor() {
        println("Infor: $name")
    }

    override val name: String
        get() = super.name

    override fun getName() {
        super.getName()
    }

    override val year: Int
        get() = 2024

    override val month: Int
        get() = 12

    override val day: Int
        get() = 1

    override fun getMonth() {
        super<A>.getYear()
        super<B>.getYear()
        super<Person>.getName()
    }

    override fun getYear() {

    }

    override fun toString(): String {
        return "To string"
    }

    companion object {

    }
}
