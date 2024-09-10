open class Car {
    //속성, 필드
    var color:String=""
    var speed:Int = 0

    //생성자 constructor
    constructor(){}

    constructor(color:String, speed:Int) {
        this.color = color
        this.speed = speed
    }

    //메소드, 기능
     open fun upSpeed(value:Int) {
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

class Automobile : Car {
    //속성 부모 : 색상, 스피드
    var seaNum : Int = 0

    //생성자
    constructor() {}

    //기능, 함수
    override fun upSpeed(value : Int) {
        if(speed + value >= 300)
            speed = 300
        else
            speed = speed + value
    }
}

class Car2 {
    var name : String = ""
    var color : String = ""
    var speed : Int = 0

    constructor(name:String, color:String, speed:Int) {
        this.name = name
        this.color = color
        this.speed = speed
    }
    fun upSpeed(value : Int) {
        if((speed+value) >= 200)
            speed = 200
        else
            speed = speed + value
    }
}

fun main() {
    //객체 생성
    var MyCar1 : Car = Car("하얀색", 0)
    println("내 차1 = " + MyCar1.color + "," + MyCar1.speed)

    //객체 생성
    var MyCar2:Car = Car("빨강", 0)
    MyCar2.upSpeed(70)
    println("내 차2 = " + MyCar2.color + "," + MyCar2.speed)

    // Automobile 객체 생성
    var automycar : Automobile = Automobile()
    automycar.upSpeed(289)
    println("내 승용차의 속도" + automycar.speed)

    var MyCar3 : Car2 = Car2("테슬라", "하얀색", 0)
    println("내 차3 = " + MyCar3.name + ", " + MyCar3.color + ", " + MyCar3.speed)

    var MyCar4 : Car2 = Car2("스포티지", "검정색", 0)
    MyCar4.upSpeed(100)
    println("내 차3 = " + MyCar4.name + ", " + MyCar4.color + ", " + MyCar4.speed)
}
