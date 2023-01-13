fun main() {
    val interestingThings = arrayOf("Kotlin", "Programming", "Comic Books")
    println(interestingThings[0])
    println(interestingThings.get(1))
    println(interestingThings.size)

    for (interestingThing in interestingThings) {
        println(interestingThing)
    }

    interestingThings.forEach { println(it) }
}