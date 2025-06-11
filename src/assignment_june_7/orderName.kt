package assignment_june_7

fun checkOrderName(name: String) {
    if (name.length >= 5) {
        println("Nice choice! Your coffee name '$name' is perfect!")
    } else {
        println("Consider a longer name for a fancier touch ☕")
    }
}

fun main() {
    checkOrderName("Latte") // Example call
}
