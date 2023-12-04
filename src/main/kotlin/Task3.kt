fun main() {

    val ingredient = arrayOf("текила", "апельсиновый сок", "сироп", "лед")

    println("Введите ингедиент")
    val inputUser = readln()

    when(inputUser) {
        ingredient[0] -> println("Ингрединет ${ingredient[0]} есть в Текила санрайз")
        ingredient[1] -> println("Ингрединет ${ingredient[1]} есть в Текила санрайз")
        ingredient[2] -> println("Ингрединет ${ingredient[2]} есть в Текила санрайз")
        ingredient[3] -> println("Ингрединет ${ingredient[3]} есть в Текила санрайз")
        else -> println("Ингредиент не найдет")
    }
}