package assignment_june_8

fun main() {
    val number: Int? = null
    val result = "The value is ${number ?: "missing"}"
    println(result)
}
