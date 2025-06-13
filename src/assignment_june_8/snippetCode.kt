package assignment_june_8

fun main() {
    val name: String? = "Kotlin"
    println(name!!.length)
    println(name?.length)
    val length = name?.length ?: -1
    println("Length is: $length")
}
