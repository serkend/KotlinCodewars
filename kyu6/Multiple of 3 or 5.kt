package codeWars.kyu6

fun main() {
    println(solution(0))
    println(solution(20))
    println(solution(200))

}

fun solution(number: Int):Int {
    var accumulator:Int = 0;
    if(number < 0) {
        return 0
    }
    for(i in 1 until number) {
        if(i % 3 == 0 || i % 5 == 0) {
            accumulator+=i
        }
    }
    return accumulator;
}