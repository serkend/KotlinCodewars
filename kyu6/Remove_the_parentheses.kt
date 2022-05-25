package codeWars.kyu6

fun main() {
    println(removeParentheses("example(unwanted thing)example"))
    println(removeParentheses("hello example (words(more words) here) something"))
}

fun removeParentheses(str:String):String{
    val firstPar = str.indexOf('(')
    val lastPar = str.lastIndexOf(')')
    return str.removeRange(firstPar, lastPar + 1)
}