package assignment_june_8

fun sumFun(a:Int,b:Int):String
{
    return "Sum of $a and $b ${a+b}"
}

fun oddSum(a:List<Int>):Int
{
    var sum=0
    for(i in a)
        sum+=i
    return sum
}

fun getFullName(first: String = "", last: String = ""): String
{
    return "$first $last".trim()
}

fun fac(a:Int):Int
{
    if(a<=1) return 1
    else return fac(a-1)*a
}

fun longestString(s:List<String>):String
{
    val it=s.iterator()
    var final=it.next().length
    var curr=s[0]
    var finalWord=curr
    while (it.hasNext())
    {
        curr=it.next()
        if(curr.length>final){
            final=curr.length
            finalWord=curr
        }
    }
    return finalWord
}

fun main(){
    sumFun(4,5)
    println(oddSum(listOf(1,2,3,4,6,7,8)))
    println(fac(5))
    println(getFullName("nafees"))
    println(longestString(listOf("nafees","hel","mick","lasseer")))
}

