package assignment_june_10

fun main() {
    print("Enter username: ")
    val username: String? = readlnOrNull() ?: "Unknown User"

    val email: String? = null
    println("Hello, $username!")
    println("Email: ${email ?: "No email provided"}")
}
