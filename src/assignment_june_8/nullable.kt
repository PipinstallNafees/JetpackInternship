package assignment_june_8

fun main() {
    val name: String? = ""

    name?.takeIf { it.isNotBlank() }?.reversed()?.let {
        println("Reversed string: $it")
    }
}
