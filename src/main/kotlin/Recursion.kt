
fun add (c:Int) :Int
{
    return if (c != 0 ) c + add(c-1)
    else 0
}
fun main() {
    print("Enter A Positive Integer:")
    val x:Int = readln()!!.toInt()
    println("Sum = " + add(x))
}