package day01

import java.io.File

fun day1partb() {
//    val fileName = "/Users/hope.ross/Desktop/mine/aoc2023/src/main/kotlin/day1testdata"
    val fileName = "/Users/kit/Desktop/aoc2023/src/main/kotlin/day01/day1testdata"
    val map = mapOf(
        "one" to 1, "two" to 2, "three" to 3, "four" to 4,
        "five" to 5, "six" to 6, "seven" to 7, "eight" to 8, "nine" to 9,
        "1" to 1, "2" to 2, "3" to 3, "4" to 4, "5" to 5, "6" to 6,
        "7" to 7, "8" to 8, "9" to 9
    )

    var acc = 0
    File(fileName).forEachLine {
        val first = map[it.findAnyOf(map.keys)!!.second].toString()
        val second = map[it.findLastAnyOf(map.keys)!!.second].toString()
        acc += (first + second).toInt()
    }
    println(acc)
}
