package assignment_june_8

fun main()
{
    val reportSheet= mutableMapOf<String,Double>()
    println("enter no of student")
    val count= readln()?.toIntOrNull() ?: return
    for (i in 1..count) {
        println("enter name")
        val name = readLine()
        if (name == null) {
            continue
        }
        println("enter mark of $name :")
        val mark = readln().toDoubleOrNull() ?: 0.0
        reportSheet[name] = mark
    }
    println("Marks of all student")
    for ((name,mark) in reportSheet)
    {
        println("name : $name mark : $mark ")
    }
    println("name of the student score more then 70")
    for ((name,mark) in reportSheet)
    {
        if (mark>70.0)
        {
            println(name)
        }
    }
}