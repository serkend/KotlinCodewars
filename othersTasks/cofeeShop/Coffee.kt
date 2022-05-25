package codeWars.othersTasks.cofeeShop

abstract class Coffee (val americanoPrice:Int, val cappuccinoPrice:Int, val lattePrice:Int){

    var americanoCount = 0
    var cappuccinoCount = 0
    var latteCount = 0

    abstract fun makeAmericano()
    abstract fun makeCappucino()
    abstract fun makeLatte()
    fun showStatistics() {
        println("Today we sold $americanoCount americano, $cappuccinoCount cappuccino, $latteCount latte")
        println("Today we earned $${americanoCount*americanoPrice + cappuccinoCount*cappuccinoPrice+latteCount*lattePrice}")
    }
}