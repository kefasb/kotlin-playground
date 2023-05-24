fun fibonacci(): Sequence<Int> = sequence {
    yieldAll(0..1)
    var prev = 0
    var current = 1
    while (true) {
        val fibb = prev + current
        yield(fibb)
        prev = current
        current = fibb
    }
}

fun main() {
    println(
        fibonacci().take(4).toList().toString()
                == "[0, 1, 1, 2]"
    )

    println(
        fibonacci().take(10).toList().toString()
                == "[0, 1, 1, 2, 3, 5, 8, 13, 21, 34]"
    )
}