import kotlin.math.*

fun main() {
    val str = "Hello World!"
    //length of a variable
    println(str.length)


    //index of a variable
    println(str[8])

    //check if a variable starts with something
    println(str.startsWith("h"))//result = true or false
    println(str.startsWith("hello"))//result = true or false
    println(str.startsWith("he", true))//ignoreCase: it's for the program know if skip the uppercase vor lowercase


    //check if a variable ends with something
    println(str.endsWith("rld"))


    //slice a variable using the index(create a new string on the memory)
    println(str.slice(2..5))

    //seeing the string using the index(just viewing the string without creating a new one)
    println(str.substring(2,5))

    //replace a string
    println(str.replace("Hello", "Good morning,"))//have ignoreCase too

    //lowercase and uppercase
    println(str.lowercase())
    println(str.uppercase())


    //remove spaces on start and end
    println("          my name is Gabrielly            ".trim())

/*MATH  BUILT-IN FUNCTIONS*/

    //print the max value of two numbers o a list of numbers
    println(max(5,10))

    //print the min value of two numbers o a list of numbers
    println(min(5,10))

    //print the square root of a number
    println(49)

    //print the value of π(PI)
    println(PI)

    //print the E
    println(E)

    //round a number
    print(round(47.888))
}