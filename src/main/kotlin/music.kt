fun main () {
    val discount = 100
    val premiumDiscount = 0.95
    val vipDiscount = 0.99

    val amountPurchases = 11000
    val musicMan = true

    val cost = when (amountPurchases) {
        in 0..1000 -> if (musicMan) amountPurchases * vipDiscount else amountPurchases
        in 1001..10_000 -> if (musicMan) (amountPurchases - discount) * vipDiscount else amountPurchases - discount
        else -> if (musicMan) amountPurchases * premiumDiscount * vipDiscount else amountPurchases * premiumDiscount
    }

    println(cost)
}