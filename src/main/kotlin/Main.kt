import java.io.File

fun main(args: Array<String>) {
    val fileName = "testdata"
    var tempList: MutableList<Int> = ArrayList()
    var holdWord: String = ""

    var acc = 0
    File(fileName).forEachLine {
        it.map{ c ->
            if (c.isLetter()) {
                holdWord += c
                println(holdWord)
            } else {
                if (holdWord.isNotBlank()) {
                    when(holdWord){
                        "two" -> tempList.add(2)
                        "nine" -> tempList.add(9)
                    }
                    holdWord = ""
                }
                tempList.add(c.digitToInt())
            }
        }
        println(tempList)
        var startNum = tempList.first()
        val endNum = tempList.last()
        startNum *= 10
        acc += startNum + endNum
        println(tempList)
        println(acc)
        tempList.clear()
        println(tempList)
    }

    println(acc)
}
