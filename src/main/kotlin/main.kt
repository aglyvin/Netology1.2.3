fun main() {
    val maxDicount = 0.05
    val standartDiscount = 10000
    val spending = 90000
    val isLoyal = true
    val orderPrice = 5000
    var finalPrice = 0;

    val discount = if(spending <= 1000100 && spending >= 100100) orderPrice * (1 - maxDicount) else ()
    if (spending <= 1000100) finalPrice = (Int)(orderPrice * (1 - maxDicount))

}
