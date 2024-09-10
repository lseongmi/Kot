fun main() {
    val mul = {x:Int, y:Int -> x*y}
    println(mul(2,3))
    println(mul(4,5))

    val cha = {x:Int, y:Int -> x-y}
    println(cha(9,8))
    println(cha(5,3))
}