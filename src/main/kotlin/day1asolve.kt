import java.io.File

fun day1parta() {
    val fileName = "/Users/hope.ross/Desktop/mine/aoc2023/src/main/kotlin/day1testdata"
    var tempList: MutableList<Int> = ArrayList()

    var acc = 0
    File(fileName).forEachLine {
        it.map{ c ->
            if (c.isDigit()) {
                tempList.add(c.digitToInt())
            }
        }
        var startNum = tempList.first()
        val endNum = tempList.last()
        startNum *= 10
        acc += startNum + endNum
        tempList.clear()
    }

    println(acc)
}