package otherClass

class NestedClass {
    fun callChild() {
        ChildClass().name
        ChildClass().foo()
    }

    class ChildClass {
        val name: String = "Child"

        fun foo() {

        }
    }
}

fun main() {
    NestedClass.ChildClass().name
    NestedClass.ChildClass().foo()
}