package classEx

class User(name: String) : Person(name) {
    override var age: Int
        get() = 10
        set(value) {}

    override fun getInfor2(): String {
        return super.getInfor2() + "Age = $age"
    }

    fun getAge() {
        println("Age: $age")
    }
}