package codeWars.kyu4

fun solution(input: String, markers: CharArray): String {
    var splittedInput = input.split('\n')
    var newStr: String = ""
    var newElem: String = ""
    //   println(splittedInput)
    for ((index, elem) in splittedInput.withIndex()) {
        newElem = elem
        for (marker in markers) {
            var markerIndex: Int = elem.indexOf(marker)
            if (markerIndex == -1) {
                continue
            }
            if (markerIndex == elem.length - 1) {
                elem.trimMargin(marker.toString())
            } else {
                newElem = elem.removeRange(markerIndex, elem.length)
            }
        }
        newElem = newElem.trimEnd()

        newStr += newElem
        if (index != splittedInput.size - 1) {
            newStr += '\n'
        }
    }
    return newStr
}

fun main() {
    println(solution("apples, plums % and bananas\npears\noranges !applesauce", charArrayOf('%', '!')))

}