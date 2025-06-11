package assignment_june_7

fun coffeeTip(number: Int): String {
    return when (number) {
        1 -> "Tip: Never underestimate the power of a good espresso!"
        2 -> "Tip: Life happens, coffee helps!"
        3 -> "Tip: Coffee first, genius thoughts later!"
        4 -> "Tip: Keep your friends close and your coffee closer!"
        else -> "Invalid tip number!"
    }
}

fun main() {
    println(coffeeTip((1..4).random())) // Example call
}
