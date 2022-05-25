package codeWars.kyu6

import kotlin.math.pow

object Cubes {
    fun isSumOfCubes(s: String): Array<Int> {
        var number: String = ""
        var integersStr: Array<String> = arrayOf<String>()
        var integers: Array<Int> = arrayOf<Int>()
        var cubicNumbers: Array<String> = arrayOf<String>()
        var cubicNum: Int = 0
        var result: String = ""
        for (c in s) {
            if (c.isDigit()) {
                number += c
            } else if (!number.isEmpty()) {
                integersStr += number
                integers += number.toInt()
                number = ""
            }

        }
//        if(result.isEmpty()) {
//            return "Unlucky"
//        }
        return integers
    }

    fun checkForCubic(numbers: Array<Int>): String {
        var result: String = ""
        var cubicNum: Int = 0
        var power = 3
        var remainedNum = 0
        var cubics: Array<Int> = arrayOf()

        for (i in numbers) {
            remainedNum = i
            while (true) {
                cubicNum += (remainedNum % 10.0).pow(power.toDouble()).toInt()
                power--;
                remainedNum /= 10
                if(remainedNum == 0) {
                    break;
                }
            }
            if (cubicNum == i) {
                result += "$cubicNum "
                cubics += i
            }
            cubicNum = 0
            power = 3
        }
        var sum: Int = cubics.sum()

        return if (cubics.isNotEmpty()){
            "$result $sum Lucky"
        } else {
            "Unlucky"
        }
    }
}

fun main() {
    println(Cubes.isSumOfCubes("0 9026315 -827&()").joinToString())
    println(Cubes.checkForCubic(Cubes.isSumOfCubes("Once 1000upon a midnight 110dreary, while100 I pondered, 9026315weak and weary -827&()")))
}