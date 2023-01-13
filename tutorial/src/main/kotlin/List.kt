fun main() {
    val interestingThings = listOf("Kotlin", "Programming", "Comic Books")
    interestingThings.forEach { println(it) }
    val res = interestingThings.map { it + "1" }.toCollection(ArrayList())
    println(res)
}