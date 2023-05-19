// Complete the declaration of the class A without throwing
// NullPointerException explicitly so that NPE was thrown during
// the creation of its subclass B instance.

private class InheritanceNPE {
    open class A(open val value: String) {
        init {
            value.get(0)
        }
    }

    class B(override val value: String) : A(value)
}

fun main() {
    val b = InheritanceNPE.B("a")
    println(b.value)
}