package assignment_june_7

import kotlin.math.cos

fun main()
{
    println("enter your age")
    val age:Int= readln().toInt()
    if(age > 60)
    {
        println("you got a discount")
        val cost=90
        val Dcost=cost*(age/100.0)
        println("total = $cost discount = $Dcost ")
    }else{
        println("sorry no discount for u")
    }
}