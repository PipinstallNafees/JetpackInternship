package assignment_june_10

fun getLength(input: String?): Int {
    return input?.length ?: 0
}

fun main() {
    val name: String? = null
    println(getLength(name))
    val username: String? = "Nafees"
    println(getLength(username))
}
