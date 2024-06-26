package lambdas

fun main() {
    // Higher order function
    foo(::printName)
    foo1()(10, 20)

    // Lambda
    val sum: ((Int, Int) -> Unit)? = {a, b ->
        println(a + b)
    }
    val print: (String) -> Unit = { name ->
        println("Lambda name: $name")
    }
    sum?.invoke(10, 20)
    foo(print)
    foo {
        println("Lambda name: $it")
    }

    // Anonymous function
    val print2: (String) -> Int = fun (num: String) : Int {
        println(num)
        return 3
    }
}

fun foo(bar: (String) -> Unit) {
    bar("Nhi")
}

fun foo1() : (Int, Int) -> Int {
    fun sum(a: Int, b: Int) : Int {
        return a + b
    }
    return ::sum
}

fun printName(name: String) {
    println(name)
}
