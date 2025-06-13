package assignment_june_8

fun main(){
    val list = mutableListOf(1, 2, 3, 4, 5)
    for(i in 0..list.size-1)
        list[i]=list[i]*list[i]
    println("new list is : $list")
}
