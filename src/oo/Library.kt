package oo

interface Lendable {
    fun borrow()
}

abstract class InventoryItem(open val title: String,
                             open val genre: String,
                             open val publicationYear: Int,
                             open var borrowed: Boolean): Lendable {
    override fun borrow() {
        if(!borrowed)
            borrowed = true
        else
            println("This item is already borrowed!")
    }
}

data class Book(override val title: String,
                override val genre: String,
                override val publicationYear: Int,
                override var borrowed: Boolean,
                val author: String): InventoryItem(title, genre, publicationYear, borrowed) {

}

data class Dvd(override val title: String,
               override val genre: String,
               override val publicationYear: Int,
               override var borrowed: Boolean,
               val length: Int): InventoryItem(title, genre, publicationYear, borrowed) {
}

fun main(args: Array<String>) {
    val book: InventoryItem = Book("Harry Potter", "fiction", 2000, false, "JK")
    println(book)
}