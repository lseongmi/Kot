fun main() {
    //갯수가 정해져있는 것 : for문(배열)
    var one:IntArray = intArrayOf(10,20,30)
    for(i in one.indices) { //indices - index의 복수(여러개가 있다. 0,1,2)
        println(one[i])
    }
    for(value in one) { //변수 in 배열명
        println(value)
    }

    var two : Array<String> = arrayOf("하나", "둘", "셋")
    for(i in 0..2 step 1) { //시작 ..곧 step 증가량
        println(two[i])
    }
    var k : Int = 0
    while(k < two.size) { //변수명.size (배열 크기) == 변수명.length
        println(two[k])
        k++ //++가 없으면 무한 루프
    }
}

