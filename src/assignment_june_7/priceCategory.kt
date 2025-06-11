package assignment_june_7

fun main(){
    println("enter ur budget")
    val price= readln().toDouble()
     when {
        price < 10 -> println("Low - Budget Friendly ☕")
        price in 10.0..30.0 -> println("Medium - Nice Quality ☕")
        else -> println("High - Premium Experience ☕")
    }
}

