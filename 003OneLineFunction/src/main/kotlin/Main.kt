fun main(args: Array<String>) {
    sum(10,4)
    sum2(10,5)
}

fun sum(a: Int,b: Int ):Int{
    return a + b
}
   //     ↑ this equals a ↓
fun sum2(a: Int,b: Int ) = (a +b)
