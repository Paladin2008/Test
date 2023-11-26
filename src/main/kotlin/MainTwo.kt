

fun main() {

    testDefault()
    testDefault(x = 1, y = 2)
    testDefault(x = 3, y = 6)

    val word1 = Word("Blue", "Синий")
    val word2 = Word("Blue", "Синий")
    val word3 = Word("White", "Белый")
    println(word1 == word2)
    println(word2 == word3)

    val word4 = word3.copy("Правильный перевод Белый")
    println(word3)
    println(word4)
}


fun testSimople(x: Int, y: Int) = x + y

fun testString(x: Int): String {
    return "String is $x"
}

fun testArguments(x: Int, y: Int, z: Int): List<Int> {
    return listOf(x,y,z)
}

fun testDefault(x: Int = 1, y: Int = 2) {
}

data class Word(
    val text: String,
    val transient:String,
)
