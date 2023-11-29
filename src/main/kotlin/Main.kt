import java.io.File

fun main(args: Array<String>) {
    val fileName = "testdata"
    var acc = 0
    File(fileName).forEachLine {
        it.map {

        }

//        val temp = it.split(",")
//        val num = temp[0]
//        val option = temp[1]
//
//        if (option == "a") {
//            acc += num.toInt()
//        }
    }
    println(acc)
}
