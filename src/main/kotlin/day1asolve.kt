import java.io.File

fun main(args: Array<String>) {
    val fileName = "testdata1a"
    var tempList: MutableList<Int> = ArrayList()

    var acc = 0
    File(fileName).forEachLine {
        it.map{ c ->
            if (c.isDigit()) {
                println(c)
                tempList.add(c.digitToInt())
            }
        }
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