package otherClass

sealed class SealedClass {
    class Jan(val fullName: String): SealedClass()
    class Feb(val value: Int) : SealedClass()
    class May: SealedClass()
}