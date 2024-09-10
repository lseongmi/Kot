//class 선언 - 틀
class Car {
    //속성, 필드
    var color:String=""
    var speed:Int = 0
    //생성자 constructor
    constructor(color:String, speed:Int) {
        this.color = color
        this.speed = speed
    }

    //메소드, 기능
    fun upSpeed(value:Int) {
        if((speed+value) >= 200)
            speed = 200
        else
            speed = speed + value
    }
    fun downSpeed(value : Int) {
        if(speed - value < 0)
            speed = 0
        else
            speed = speed - value
    }
}

fun main() {
    //객체 생성
    var MyCar1 : Car = Car("하얀색", 0)
    //MyCar1.color = "하얀색"
    //MyCar1.speed = 0

    //객체 생성
    var MyCar2:Car = Car("빨강", 0)
    //MyCar2.color = "빨강"
    //MyCar2.speed = 0
    println("내 차1 = " + MyCar1.color + "," + MyCar1.speed)

    MyCar2.upSpeed(70)
    println("내 차2 = " + MyCar2.color + "," + MyCar2.speed)

}