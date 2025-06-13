package assignment_june_8

fun main()
{
    val list= mutableListOf<Int>()
    for (i in 1..10)
    {
        list.add(i)
    }
    println(list)
    val i=list.iterator()
    while(i.hasNext())
    {
        if(i.next()%2!=0)
        {
            i.remove()

        }
    }
    println(list)
}