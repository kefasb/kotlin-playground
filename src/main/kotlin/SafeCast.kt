fun main() {
    val value = "aaa"

    println(value as? Int)
    println((value as? Int)?.inc())
    println((value as? String)?.length)
}