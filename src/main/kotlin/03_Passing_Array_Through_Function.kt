fun main() {
    val x : Array <Int> = Array(4) {0}
    val y : Array <Int> = Array(4) {0}
    input(x)
    output(x)

    input(y)
    output(y)
}
fun input (x:Array<Int>)
{
    println("Enter The Elements of Array : ")
    for (i in x.indices)
    {
        x[i]  = readln()!!.toInt()
    }
}
fun output (x: Array<Int>)
{
    for (i in x.indices)
    {
        println("x[$i] = " + x[i])
    }
}