package otherClass

enum class EnumClass(val value: Int) {
    SAMSUNG(value = 0) {
        override fun getName() : String {
            return "Samsung"
        }
    }, APPLE(value = 1) {
        override fun getName(): String {
            return "Apple"
        }
    }, REDMI(value = 2) {
        override fun getName(): String {
            return "Redmi"
        }
    }, VSMART(value = 3) {
        override fun getName(): String {
            return "Vsmart"
        }
    };


    abstract fun getName() : String
}

fun main() {
    val phone = EnumClass.VSMART

    when(phone) {
        EnumClass.APPLE -> println("Apple")
        EnumClass.VSMART -> println("VSmart")
        EnumClass.REDMI -> println("Redmi")
        EnumClass.SAMSUNG -> println(EnumClass.SAMSUNG.value)
    }
}