package ru.ennesterov.coffeemachine

abstract class CoffeeMain(val costCappuccino: Double, val costAmericano: Double,val costEspresso: Double) {

    abstract fun makeCappuccino()
    abstract fun makeAmericano()
    abstract fun makeEspresso()

    abstract fun price(): Double

}