package Assignment
/* Kotlin Program to Find the Frequency of Character in a String */
fun main() {
    println("Enter the string: ")
    var str1 = readln()
    println("Enter the character from the above string")
    var ch = readln()!!.toCharArray()[0]
    var fre: Int = 0
    for (element in str1)
    {
        if (ch == element)
        {
            fre++
        }
    }
    println("The frequency of character $ch in $str1 is = $fre")
}

