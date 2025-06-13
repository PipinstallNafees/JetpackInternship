package assignment_june_8

fun main(){
    val word= listOf("egg","nafees","kotlin","jetpack","kt","app")
    println(word)
    val i=word.iterator()
    var count=0
    while (i.hasNext())
    {
        if (i.next().length>4)
            count+=1
    }
    println("no of words more then 4 letter :$count")
}