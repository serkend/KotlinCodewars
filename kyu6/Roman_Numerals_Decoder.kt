package codeWars.kyu6

fun transformToInt(romanStr: String): Int = when (romanStr) {
    "I" -> 1
    "V" -> 5
    "X" -> 10
    "L" -> 50
    "C" -> 100
    "D" -> 500
    "M" -> 1000
    else -> {
        println("Unknown number")
        0
    }
}

fun decode(str: String): Int {
    var accumulator: Int = 0
    var charArray = str.toCharArray()
    var numbers = mutableListOf<Int>()
    var flag:Boolean = false
    for (char in charArray) {
        val num: Int = transformToInt(char.toString())
        numbers += num
    }
    if (numbers.size == 1) {
        accumulator += numbers.last()
        return accumulator
    }
    for ((index) in numbers.withIndex()) {
        if(flag) {
            flag = false
            continue
        }
        if (index == numbers.size - 1) {
            accumulator += numbers[index]
        } else if ((numbers[index] < numbers[index + 1])) {
            accumulator += (numbers[index + 1] - numbers[index])
            flag = true
        } else {
            accumulator += numbers[index]
        }
    }
    return accumulator
}

fun main() {
    println(decode("MCDLXIX"))
}