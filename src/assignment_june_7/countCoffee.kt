package assignment_june_7

fun main() {
    var stock = 10
    do {
        println("Stock remaining: $stock cups")
        stock--
    } while (stock > 0)
    println("Out of stock!")
}
