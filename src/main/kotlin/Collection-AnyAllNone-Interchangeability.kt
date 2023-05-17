fun main() {
    checks()
}

fun List<Int>.allNonZero() = all { it != 0 }
fun List<Int>.allNonZero1() = none { it == 0 }
fun List<Int>.allNonZero2() = !any { it == 0 }

fun List<Int>.containsZero() = any { it == 0 }
fun List<Int>.containsZero1() = !all { it != 0 }
fun List<Int>.containsZero2() = !none { it == 0 }

private fun checks() {
    val list1 = listOf(1, 2, 3)
    check(list1.allNonZero())
    check(list1.allNonZero1())
    check(list1.allNonZero2())

    check(!list1.containsZero())
    check(!list1.containsZero1())
    check(!list1.containsZero2())

    val list2 = listOf(0, 1, 2)
    check(!list2.allNonZero())
    check(!list2.allNonZero1())
    check(!list2.allNonZero2())

    check(list2.containsZero())
    check(list2.containsZero1())
    check(list2.containsZero2())
}
