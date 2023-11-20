fun main() {
    println("hello kotline")

    var a: Int = 123 // 코틀린은 기본 변수에서 null을 허용하지 않는다.
    println(a)

    var intValue:Int = 1234
    var longValue:Long = 1234L
    var intValueByHex:Int = 0x1af
    //코틀린은 8진수 표기는 지원하지 않는다.

    var doubleValue:Double = 123.5 //실수는 소수점을 포함해 숫자를 쓰거나
    var doubleValueWithExp:Double = 123.5e10 //필요시 지수 표기법을 추가한다.
    var floatValue:Float = 123.5f //Float는 f를 붙인다.

    println(intValue)
    println(longValue)
    println(intValueByHex)
    println(doubleValue)
    println(doubleValueWithExp)
    println(floatValue)

    var charValue:Char = 'a'
    var koreanCharValue:Char = '가'
    var stringValue = "one line string test"
    var multiLineStringValue = """multiline
    string
    test"""
    var booleanValue:Boolean = true

    var intArr = arrayOf(1,2,3,4,5) //int 배열
    var nullArr = arrayOfNulls<Int>(5) //비어있는 5크기의 배열

    intArr[2] = 8
    println(intArr.get(2))

    var a1:Int = 1
    var b1:Int = 2
    var c1:Int = 3
    val add = add(1, 2, 3)
    println(add)


    for(i in 0..9 step 3){ //0~9까지 3 단위로 반복
        print(i)
    }
}
fun add(a: Int, b: Int, c:Int): Int {
    return a + b + c
    //리턴 발생 시 함수 중간이더라도 함수 종료
}