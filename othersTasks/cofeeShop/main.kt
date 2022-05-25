package codeWars.othersTasks.cofeeShop

import kotlin.system.exitProcess

fun main() {
    var moscowCoffee = MoscowCoffee(4, 5, 7)
    var newYorkCoffee = NewYorkCoffee(7, 8, 8)

    while (true) {
        println("Choose your Coffee Shop\n1. Moscow Coffee Shop\n2. New York Coffee Shop \n0. Exit")
        var coffeeShop: Coffee = when (readLine()) {
            "1" -> moscowCoffee
            "2" -> newYorkCoffee
            "0" -> {
                exitProcess(0)
            }
            else -> {
                println("There is no such coffee shops")
                exitProcess(1)
            }
        }

        println("Choose your favourite coffee \n1. Americano \n2. Cappuccino \n3. Latte \n0. Exit ")
        when (readLine()) {
            "1" -> coffeeShop.makeAmericano()
            "2" -> coffeeShop.makeCappucino()
            "3" -> coffeeShop.makeLatte()
            "0" -> {
                exitProcess(0)
            }
            else -> {
                println("There is no such coffee")
                exitProcess(1)
            }
        }

        if (coffeeShop is Biscuits) {
            println("Do you need biscuits? \n1. Yes \n2. No \n0. Exit")
            when (readLine()) {
                "1" -> coffeeShop.sellBiscuits()
                "2" -> coffeeShop.makeCappucino()
                "0" -> {
                    exitProcess(0)
                }
                else -> {
                    println("There is no such choice")
                    exitProcess(1)
                }
            }
        }

        println("Do you want to see statistics? \n1. Yes \n2. No")
        when (readLine()) {
            "1" -> coffeeShop.showStatistics()
            "2" -> exitProcess(0)
            else -> {
                println("There is no such choice")
                exitProcess(1)
            }
        }
    }
}