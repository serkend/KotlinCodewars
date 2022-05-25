package codeWars.othersTasks.cofeeShop

class MoscowCoffee(americanoPrice:Int, cappuccinoPrice:Int, lattePrice:Int) :
    Coffee(americanoPrice, cappuccinoPrice, lattePrice) {
    override fun makeAmericano() {
        americanoCount++
        println("Thanks for Americano order from Moscow!")
    }

    override fun makeCappucino() {
        cappuccinoCount++
        println("Thanks for Cappucino order from Moscow!")
    }

    override fun makeLatte() {
        latteCount++
        println("Thanks for Latte order from Moscow!")
    }

}