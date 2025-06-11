package assignment_june_7

fun categorizeTemperature(temp: Int): String {
    return when (temp) {
        in 0..30 -> "Too Cold ❄️"
        in 31..60 -> "Perfect ☕"
        else -> "Too Hot 🔥"
    }
}

fun main() {
    println(categorizeTemperature(45)) // Example call
}
