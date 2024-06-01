package lecture004

fun main() {
    val money1 = JavaMoney(1_000L)
    val money2 = JavaMoney(2_000L)

    if (money1 < money2) {
        println("Money1이 Moeny2 보다 금액이 크다.")
    }
}