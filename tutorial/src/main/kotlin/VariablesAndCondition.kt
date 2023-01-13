//val globalName: String = "ario global"
var couldBeNull : String? = "can accept Null value"

fun main(args: Array<String>) {
//    println("Hello World!")

//    val p: Float = 3.14F
//    println("Constant value of p is $p")

//    var name: String = "Ario"
//    println("My name is $name")
//    name = "Massoud"
//    println("My legal name is $name")

//    println("The global name is $globalName")
//    couldBeNull = null
//    println("We have a possible null variable: $couldBeNull")

//    var withoutType = "No need to mention type"
//    println(withoutType)

//    if (couldBeNull != null) {
//        println("couldBeNull is not null")
//    } else {
//        println("couldBeNull is null")
//    }
//    when (couldBeNull) {
//        null -> println("variable is null!")
//        else -> println("variable is not null")
//    }

    var printVariable = if (couldBeNull != null) couldBeNull else "Sorry for the null!"
    println("printVariable by if => $printVariable")

    printVariable = when(couldBeNull) {
        null -> "Sorry for the null!"
        else -> couldBeNull
    }
    println("printVariable by when => $printVariable")
}