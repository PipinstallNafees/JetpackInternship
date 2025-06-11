package assignment_june_7

fun main(){
    println("enter the level")
    val caffeine= readln().toInt()
    when (caffeine) {
        in 0..30 -> println("Mild")
        in 31..70 -> println("Medium")
        in 71..100 -> println("Strong")
        else -> println("Invalid level")
    }
}

