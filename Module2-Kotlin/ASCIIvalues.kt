package Assignment

//Find ASCII value of a character

fun main() {
    println(" Enter a Character for ASCII value :")
    var ch= readln()!!.toCharArray()[0]
    println("value of ASCII value for $ch is ${ch.toInt()}")
}