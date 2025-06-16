package assignment_june_10

fun main() {
    var username: String? = "Nafees"
    println("Username length: ${username?.length}")
    username=null
    println("Username length: ${username?.length}")
}
