package lecture003

fun main() {

    // * 명시적으로 to변환 타입을 선언해줘야함
    // * (타입 변환을 할 때는 toLong()과 같은 것을 사용)
    var number1 = 3
    var number2: Long = number1.toLong()

    // * 변수가 nullable이라면 적절한 처리가 필요하다.
    var numb01: Int? = 3
    var numb02: Long = numb01?.toLong() ?: 0L
}
