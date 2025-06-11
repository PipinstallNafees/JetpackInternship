package assignment_june_7

fun main() {
    val cost = 100
    println("Discount Table:")
    for (discount in 10..50 step 10) {
        val finalPrice = cost - (cost * discount / 100)
        println("$discount% off -> Final Price: $$finalPrice")
    }
}
