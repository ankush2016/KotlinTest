fun main() {
    greeting()
    kotlinCollections()

    var myArray = arrayOf("Ankush", "Arsh", "Komal")
    varargsTest("Hi", *myArray)
}

fun varargsTest(greeting: String, vararg items: String) {
    items.forEachIndexed { index, item -> println("$greeting $item") }
}

fun greeting() = println("Hello")

fun kotlinCollections() {
    var myArray = mutableListOf("Kolin", "Java", "Python", "C++")
    myArray.forEachIndexed { index, item ->
        println("$index - $item")
    }

    var map = mapOf(1 to "a", 2 to "b", 3 to "c")
    map.forEach { (key, value) -> println("$key - $value") }
}
