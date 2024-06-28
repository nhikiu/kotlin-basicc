package otherClass

fun main() {
    // data class
    val dataClass = DataClass("Nhi", 22)
    println(dataClass)
}

// có sẵn các hàm hashCode, copy, toString, components, equal
// chỉ có các hàm trên cho các thuộc tính ở trong constructor
data class DataClass(
    val name: String,
    val age: Int
)
