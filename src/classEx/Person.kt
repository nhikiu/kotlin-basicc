package classEx

open class Person(name: String) {
    internal val name: String
        get() = field
    open var age: Int = 7
        get() = field
        set(value) {
            field = value
        }

    // primary constructor
    init {
        this.name = name
    }

    // secondary constructor
    constructor(name: String, age: Int) : this(name) {
        this.age = age
    }

    internal fun getInfor() : String {
        return "Name: $name, Age: $age"
    }

    open fun getInfor2() : String {
        return "Name: $name, Age: $age"
    }

    companion object test {
        val companyName = "company_name"

        fun getCompanyAddress() : String {
            return "company_address"
        }
    }
}