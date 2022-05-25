package codeWars.kyu7

import kotlin.math.abs

fun main() {
    var s1 = arrayOf<String>("hoqq", "bbllkw", "oox", "ejjuyyy", "plmiis", "xxxzgpsssa", "xxwwkktt", "znnnnfqknaz", "qqquuhii", "dvvvwz")
    var s2 = arrayOf<String>("cccooommaaqqoxii", "gggqaffhhh", "tttoowwwmmww")
    s1 = arrayOf<String>("ejjjjmmtthh", "zxxuueeg", "aanlljrrrxx", "dqqqaaabbb", "oocccffuucccjjjkkkjyyyeehh")
    s2 = arrayOf<String>("bbbaaayddqbbrrrv")
    println(findMaxDiff(s1, s2))
}
fun findMaxDiff(s1:Array<String>, s2:Array<String>) :Int {
    if(s1.isEmpty() || s2.isEmpty()) {
        return -1
    }
    var maxDiff:Int = abs(s1.get(0).length - s2.get(0).length)
    var diff:Int;
    for(item1 in s1) {
        for(item2 in s2) {
            diff = abs(item1.length - item2.length)
            if (diff > maxDiff) {
                maxDiff = diff
            }
        }
    }

    return maxDiff;
}
