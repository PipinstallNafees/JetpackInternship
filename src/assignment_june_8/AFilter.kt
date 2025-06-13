package assignment_june_8

fun main()
{
    val nameList= mutableListOf<String>("nafees","aryan","ayan","naseeb","hazalwood","salt")
    println("Orignal List:")
    for (i in nameList)
        println(i)
    val i= nameList.iterator()
    while (i.hasNext())
    {
        if(i.next().startsWith("a"))
        {
            i.remove()
        }
    }
    println("Filter List:")
    for (i in nameList)
    {
        println(i)
    }
}