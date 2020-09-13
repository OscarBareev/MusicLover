fun main() {

    var isRegular: Boolean = true
    var lastPurchase: Double = 2000.0
    var newPurchase: Double = 4000.0
    var discount: Double
    var endAmount: Double


    discount = if (lastPurchase <= 1000) {
        0.0
    } else if (lastPurchase > 1000 && lastPurchase <=10_000) {
        100.0
    } else {
        lastPurchase * 0.05
    }

    endAmount = lastPurchase - discount

    if (isRegular){
        endAmount -= endAmount * 0.01
    }

    println("Скидка: $discount, к оплате: $endAmount")


}