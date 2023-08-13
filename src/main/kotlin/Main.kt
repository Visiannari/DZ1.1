
fun main() {
    val amount = 508_202
    var commission = amount / 100 * 0.75
    var result  = if (commission > 35) println("${commission} руб.")  else println("35")


}
