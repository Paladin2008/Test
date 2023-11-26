fun main() {

//    val caseOne = Case<TestOne, Int>(TestOne(1000), 8)
//
//    println(caseOne.get())
//    caseOne.add(TestOne(500))
//    println(caseOne.get())
//    println(caseOne.get2())
//
//    val caseTwo = Case<TestTwo, String>(TestTwo("Word"), "sing")
//
//    println(caseTwo.get())
//    caseTwo.add(TestTwo("word "))
//    println(caseTwo.get())
//    println(caseTwo.get2())

    say("Hi")
}

fun <T> say(item: T) {
    println("Hi $item")
}