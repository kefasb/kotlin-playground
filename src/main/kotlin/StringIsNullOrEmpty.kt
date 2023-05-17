fun main() {
    isNullOrEmpty()
}

fun isNullOrEmpty() {
    val s1: String? = null
    val s2 = ""
    val s3 = " "

    check(s1.isNullOrEmpty1() == s1.isNullOrEmpty())
    check(s1.isNullOrEmpty2() == s1.isNullOrEmpty())
    check(s2.isNullOrEmpty1() == s2.isNullOrEmpty())
    check(s2.isNullOrEmpty2() == s2.isNullOrEmpty())
    check(s3.isNullOrEmpty1() == s3.isNullOrEmpty())
    check(s3.isNullOrEmpty2() == s3.isNullOrEmpty())
}

fun String?.isNullOrEmpty1(): Boolean {
    return (this == null) || isEmpty()
}

fun String?.isNullOrEmpty2(): Boolean {
    return this?.isEmpty() ?: true
}