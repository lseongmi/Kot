fun main() {
    val greeting2 = {name : String, age : Int -> "Hello my name is $name. I am $age"}

    val result2 = greeting2("dongyang", 20)
    print(result2)
}