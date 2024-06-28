package otherClass

class Outer {
    val name: String = "Outer"

    fun callInner() {
        InnerClass().foo()
    }

    inner class InnerClass {
        fun foo() {
            name
        }
    }
}

fun main() {
    Outer().InnerClass().foo()
}