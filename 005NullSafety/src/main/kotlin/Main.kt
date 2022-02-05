fun main() {
    /*HOW TO AVOID THE ERROR*/

    val str: String? = null
    //logic
    println(str?.length)//use the ? to avoid the error and keep running the code
    print("he keeps to the end")

    /*the difference between ? and !! is the if you put !! you basic saying that
    will be not error and the python don't need to deal*/


    //EXAMPLE:
    val abc = readLine()
    if(abc != null && abc != ""){
        println("Is empty")
    }
    //OR
    println(abc?.length)
}