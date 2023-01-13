fun main() {
    // collections are immutable by default
    val map = mapOf(1 to "a", 2 to "b", 3 to "c")
    map.forEach { (key, value) -> println("$key -> $value") }

//    map.put
    val mutableMap = mutableMapOf(1 to "a", 2 to "b", 3 to "c")
    mutableMap[4] = "d"
    println(mutableMap)

}