package assignment_june_8

fun findMaxOrDefault(numbers: List<Int>?): Int {
    return if (!numbers.isNullOrEmpty()) numbers.maxOrNull() ?: -1 else -1
}

fun main()
{
    println(findMaxOrDefault(listOf()))
}