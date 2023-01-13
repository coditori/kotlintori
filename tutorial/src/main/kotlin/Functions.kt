fun getGreeting(): String {
    return "Hello Kotlin"
}

fun sayHello(greeting: String, itemToGreet: String) = println("$greeting $itemToGreet")

fun optionalParam(greeting: String, vararg itemsToGreet: String) {
    itemsToGreet.forEach { println(it) }
}

fun nameArgsFunc(greeting: String = "Hello", name: String = "Ario") = println("$greeting $name")

fun main() {
    println(getGreeting())
    sayHello("Hello", "World")

    optionalParam("Hi", "Kotlin", "Programming", "Comic Books")

    val interestingThings = arrayOf("Kotlin", "Programming", "Comic Books")
    optionalParam("Hi", *interestingThings)
    val interestingThings2 = listOf("Kotlin", "Programming", "Comic Books")
    // spread operator just work with array
//    optionalParam("Hi", *interestingThings2)

    nameArgsFunc(name = "ario")
}
