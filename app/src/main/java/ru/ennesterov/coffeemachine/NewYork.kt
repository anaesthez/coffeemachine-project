package ru.ennesterov.coffeemachine

class NewYork(costCappuccino: Double,  costAmericano: Double, costEspresso: Double):
    CoffeeMain(costCappuccino,costAmericano,costEspresso){
    var countCappuccino = 0.0
    var countAmericano = 0.0
    var countEspresso = 0.0
    override fun makeCappuccino() {
        countCappuccino++
        println("make Cappuccino")
    }
    override fun makeAmericano() {
        countAmericano++
        println("make Americano")
    }
    override fun makeEspresso() {
        countEspresso++
        println("make Espresso")
    }
    override fun price() = countCappuccino * costCappuccino + countAmericano * costAmericano +
            + countEspresso * costEspresso
}