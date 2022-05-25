package codeWars.kyu5

    fun findSimpleNums(m: Int, n: Int): Array<Int> {
        var simpleNums = arrayOf<Int>()
        for (i in m..n) {
            if (checkForSimple(i)) {
                simpleNums += i
            }
        }
        return simpleNums
    }

    fun checkForSimple(num: Int): Boolean {
        for (i in 2 until num) {
            if (num % i == 0) {
                return false
            }
        }
        return true
    }

    fun execCond(g: Int, m: Int, n: Int) {

    }

fun main() {
    println(findSimpleNums(1,15).joinToString())
}