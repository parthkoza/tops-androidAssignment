package Assignment

//Kotlin Program to Check Whether a Number is Even or Odd

fun main() {
    println("Enter a Integer : ")
    var num = readln()!!.toInt()
    var result = when(num%2==0)
    {
        true->"Your Number id even"
        else->"Your number is odd"
    }
    println(result)
}