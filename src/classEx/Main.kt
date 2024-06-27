package classEx

fun main() {
    val person = Person("Nhi", 22)
    println(person.getInfor())

    // companion object
    Person.companyName
    Person.getCompanyAddress()
    Person.test.companyName
    Person.test.getCompanyAddress()

    val user = User("Nhi")
    println(user.getInfor2())
}