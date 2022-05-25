package codeWars.othersTasks.cofeeShop

class NewYorkCoffee(americanoPrice:Int, cappuccinoPrice:Int, lattePrice:Int)
    : Coffee(americanoPrice, cappuccinoPrice, lattePrice), Biscuits {
    override fun makeAmericano() {
        americanoCount++
        println("Thanks for Americano order from New York!")
    }

    override fun makeCappucino() {
        cappuccinoCount++
        println("Thanks for Cappucino order from New York!")
    }

    override fun makeLatte() {
        latteCount++
        println("Thanks for Latte order from New York!")
    }

    override fun sellBiscuits() {
        println("Thanks for Biscuits order from New York!")
    }

}