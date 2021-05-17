package ru.netology

fun main() {
    val transferFee = 0.75
    val minTransferFee = 3_500
    val amount = 456 * 100

    val fee = (amount * transferFee) / 100
    val totalFee = if (fee > minTransferFee) {
        fee / 100
    } else {
        minTransferFee / 100
    }
    print(("Скидка составляет ") + ("%.2f".format(totalFee.toDouble())) + (" рублей."))
}