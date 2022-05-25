package codeWars.kyu6

fun toScores(char:Char):Int {
    return char - '`'
}

fun high(str: String) : String {
    var words: List<String> = str.split(' ')
    val scores: MutableList<Int> = mutableListOf()
    for(word in words) {
        var wordScore:Int = 0
        word.forEach {  wordScore+= toScores(it)}
        scores += wordScore
    }
    val maxScoreIndex = scores.indexOf(scores.maxOrNull())
    return words[maxScoreIndex]
}

fun main() {
    println(high("man i need a taxi up to ubud"))
    println(high("what time are we climbing up the volcano"))
    println(high("aa b b"))
}