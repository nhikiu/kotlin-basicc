fun main() {
    println("Hello World!")

    // when expression
    val age = 10
    val price = when (age) {
        in 0..10 -> 50
        in 11 until 65 -> 70
        else -> 100
    }
    println("----------------------when expression----------------------")
    println("Price = $price")

    // if expression
    val type = "car"
    val tax = if (type == "car") 10.0 else 2.0
    println("----------------------if expression----------------------")
    println("Tax of $type is $tax")

    // For loops
    val vegetables = arrayListOf("Potato", "Tomato", "Carrot")
    println("----------------------For each----------------------")
    vegetables.forEach {
        println(it)
    }
    println("----------------------For each----------------------")
    for (v in vegetables) {
        println(v)
    }
    println("----------------------For withIndex----------------------")
    for ((index, value ) in vegetables.withIndex()) {
        println("Index: $index has value $value")
    }

    // while
    println("----------------------While----------------------")
    var x = 10
    while (x > 0) {
        x--
        println("x = $x")
    }

    do {
        x++
        println("x = $x")
    } while (x < 10)

    // is, !is
    println("----------------------is, !is----------------------")
    val value = "val"
    println(isString(value))
}

fun isString(any: Any) : Boolean {
    if (any is String) return true
    return false
}
