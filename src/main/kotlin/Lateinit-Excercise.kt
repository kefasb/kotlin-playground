// Without modifying the class 'A' complete the code in 'main'
// so that an exception UninitializedPropertyAccessException was thrown.
// Then fix the newly added code in 'main' so that no exception was thrown.

private class Lateinit {
    class A {
        private lateinit var prop: String

        fun setUp() {
            prop = "value"
        }

        fun display() {
            println(prop)
        }
    }
}

fun main() {
    val a = Lateinit.A()
    // Uncomment below to avoid exception
    //a.setUp()
    a.display()
}