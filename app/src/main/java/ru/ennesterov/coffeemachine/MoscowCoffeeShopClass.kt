package ru.ennesterov.coffeemachine

class MoscowCoffeeShopClass(costCappuccino: Double, costAmericano: Double, costEspresso: Double):
    CoffeeMain(costCappuccino,costAmericano,costEspresso) {

    var countCappuccino = 0.0
    var countAmericano = 0.0
    var countEspresso = 0.0

    override fun makeCappuccino() {
        countCappuccino++
        println("making Cappuccino")
    }

    override fun makeAmericano() {
        countAmericano++
        println("making Americano")
    }

    override fun makeEspresso() {
        countEspresso++
        println("making Espresso")
    }

    override fun price() =
        countCappuccino * costCappuccino + countAmericano * costAmericano + countEspresso * costEspresso

}
