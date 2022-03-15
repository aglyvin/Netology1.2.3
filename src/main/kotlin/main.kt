fun main() {
    val maxDicount = 5
    val standartDiscount = 10000
    val spending = 90000
    val isLoyal = true
    val orderPrice = 500000
    val loyalDiscount = 1

    var discount = if(spending <= 100100) 0 else (standartDiscount)
    if(spending >= 10001){
        discount = orderPrice * maxDicount / 100;
    }
    var finalPrice = orderPrice - discount
    if (isLoyal) {
        finalPrice = finalPrice * (100 - loyalDiscount) / 100
    }
    println("Purchase: $orderPrice")
    println("Final orice: $finalPrice")




}
