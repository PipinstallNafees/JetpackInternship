package interviewQuestion

fun main() {
    val input1="0.12.49.250"
    println(ipValidation(input1))


}
fun ipValidation(str:String):String {
    val n=str.split(".")
    if ( n[0].toInt() == 0) {
        return "invalid"
    }
    for (i in n) {
        if(i.toInt()-255>0 || i.toInt()<0) {
            return "invalid"
        }
    }
    return "valid"
}