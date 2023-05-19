val foo: Int
    get() = bar

var bar: Int = 0
    get() = field++

fun main(args: Array<String>) {
    // The values should be different:
    println(foo)
    println(foo)
    println(foo)
}
