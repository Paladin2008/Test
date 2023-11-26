fun main() {

    val list = listOf(3, 4, 5)
    val list2 = mutableListOf(1, 2, 3)

    val mutableList = mutableListOf(11, 14, 15, 16, 17, 18)
//    println(mutableList)

    mutableList.add(36)
//    println(mutableList)

    mutableList.add(0, 36)
    println(mutableList)

//    println(mutableList.contains(36))

//    println(mutableList.isEmpty())
//    println(mutableList.isNotEmpty())

//    println(mutableList.indexOf(36))
//    println(mutableList.lastIndexOf(36))

    mutableList.sort()
    mutableList.sortDescending()
    mutableList.reverse()
//    println(mutableList)

    mutableList.forEach {
        println(it)
    }
}