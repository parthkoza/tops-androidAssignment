package Assignment

//Kotlin Program to Compute Quotient and Remainder

fun main() {

    println("Enter a Dividend :")
    var dividend= readln()!!.toInt()
    println("Enter a Divisor :")
    var Divisor= readln()!!.toInt()
    var Quotient=dividend.div(Divisor)
    var Reminder=dividend.mod(Divisor)
    println("Quotient of $dividend/$Divisor = $Quotient")
    println("Reminder of  $dividend/$Divisor =$Reminder")


}