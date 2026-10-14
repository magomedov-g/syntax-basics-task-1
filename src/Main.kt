fun countConsecutiveChars(inputStr: String): String {
    if (inputStr.isEmpty()) return ""

    val result = StringBuilder()
    var count = 1

    for (i in 1 until inputStr.length) {
        if (inputStr[i] == inputStr[i - 1]) {
            count++
        } else {
            result.append(inputStr[i - 1])
            if (count > 1) result.append(count)
            count = 1
        }
    }

    result.append(inputStr[inputStr.length - 1])
    if (count > 1) result.append(count)

    return result.toString()
}

fun main() {
    val inputStr = "GGGGGGHHHHHDDDDLLOEE"
    val outputStr = countConsecutiveChars(inputStr)
    println(outputStr)
}
