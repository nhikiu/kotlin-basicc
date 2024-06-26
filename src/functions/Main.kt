package functions

fun main() {
    sum(a = 1)
    sum(a = 1, b = 3)
    sub(10, 20)
    div(10, b = 3)
    div(1, 0)
    div(b = 9)
    printName("My", "Nam", "Mai", "Linh")
}

fun sum(a: Int, b: Int = 1) : Int {
    return a + b
}

fun sub(a: Int, b: Int) = a - b

fun div(a: Int = 9, b: Int) : Double?{
    if (b == 0) {
        println("b must not be 0")
        return null
    }
    return a.toDouble().div(b)
}

fun printName(vararg names : String) {
    names.forEach {  name ->
        println(name)
    }
}

tailrec fun factorial(number: Long, a: Long) : Long {
    return if (number == 1L) 1 else factorial(number - 1, number * a)
}

