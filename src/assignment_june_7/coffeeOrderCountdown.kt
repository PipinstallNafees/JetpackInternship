package assignment_june_7

fun main() {
    for (order in 1..10) {
        if (order % 3 == 0) { // Assuming every 3rd order is decaf
            println("Skipping decaf order #$order")
            continue
        }
        println("Processing regular order #$order ☕")
    }
}
