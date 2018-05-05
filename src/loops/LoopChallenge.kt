package loops

fun main(args: Array<String>) {
    println(calculateSumOfNumbers(100, 100000))
}

public fun calculateSumOfNumbers(from: Long, to: Long): Long {
    var sum: Long = 0
    for(i in from..to) {
        sum = sum + i
    }
    return sum
}