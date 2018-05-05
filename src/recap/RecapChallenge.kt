package recap

fun main(args: Array<String>) {
    val favoriteBooks = arrayListOf("Harry Potter", "Cloud Atlas", "Flashboys", "Lord of the Rings", "Rivers of London")
    val letter ='e'

    for (book in favoriteBooks) {
        if(containsLetter(book, letter))
            printCharInNewLine(book)
    }
}

fun containsLetter(word: String, letter: Char): Boolean {
    return word.contains(letter)
}

fun printCharInNewLine(word: String) {
    for(letter in word.toCharArray())
        println(letter)
}