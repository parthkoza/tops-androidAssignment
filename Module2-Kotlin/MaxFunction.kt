package Assignment
/* WAP to find max value using function as express */
fun max(num1:Int,num2:Int): Int
{
    if (num1>num2) return num1
    else return num2
}
fun main() {
    println("Enter number1: ")
    var num1 = readln().toInt()
    println("Enter number2: ")
    var num2 = readln().toInt()
    println("The maximum number from above two is ${max(num1,num2)}")
}
