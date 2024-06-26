package inlineFunc

fun main (){
    foo {
        if (it == 0) {
            return
        }
    }

    // generic
    printGeneric(0)
    printGeneric("Hello")
    printGeneric(arrayOf(1, 2, 3, "4"))

    printGeneric2<String>("a")
    printGeneric2<Int>("a")
}

inline fun foo(checkZero: (Int) -> Unit) {
    val list = listOf(1, 2, 3, 0, 6, 5)
    for (item in list) {
        checkZero(item)
        println()
    }
}

fun <T> printGeneric(a: T) {
    println(a)
}

inline fun <reified T> printGeneric2(a: Any) {
    println(a is T)
}