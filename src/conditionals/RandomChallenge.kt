package conditionals

import java.util.Random

fun main(args: Array<String>) {
    val random = generateRandomNumber()
    val msg = calculateRange(random)
    println(random.toString() + " is " + msg)
}

public fun generateRandomNumber(): Int {
    return Random().nextInt(50) + 1
}

public fun calculateRange(random: Int): String {
    val msg = when (random) {
        in 1..10 -> "in 1-10"
        in 11..20 -> "in 11-20"
        in 21..30 -> "in 21-30"
        in 31..40 -> "in 31-40"
        else -> "larger than 40"
    }
    return msg
}