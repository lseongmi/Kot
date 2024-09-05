var MyVar : Int = 100 //전역변수 : 전체의 변수
fun main() {
    var MyVar : Int = 0 //지역변수
    println(MyVar)//지역변수를 따른다

    var sum : Int = addFunction(10, 20)
    println(sum)
}

fun addFunction(num1:Int, num2:Int):Int {
    var hap : Int
    hap = num1 + num2 + MyVar
    return hap
}