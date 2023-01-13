package classes

class Person (val firstName: String, val lastName: String) {

    init {
        println("inti 1")
    }

    constructor()  : this("Peter", "Parker") {
        println("secondary constructor")
    }

    init {
        println("init 2")
    }
}