package assignment_june_7

fun main()
{
    println("enter the day")
    val day= readln()
    when(day)
    {
        "monday" -> println("Today's special capacino")
        "tuesday" -> println("Today's special latie")
        "wednesday" -> println("Today's special boba")
        "thursday" -> println("Today's special black coffee")
        "friday" -> println("Today's special cold coffee")
        "saturday" -> println("Today's special tea")
        "sunday" -> println("we are in weekend")
    }
}