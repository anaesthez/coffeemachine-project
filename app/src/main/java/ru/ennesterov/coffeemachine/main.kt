package ru.ennesterov.coffeemachine
import kotlin.system.exitProcess

fun main() {

    while (true) {

        println("Choose city: New York, Moscow or Exit")

        val currentCoffeeShop = coffeeShopInit(readln())   // Присваиваем переменной значение выбранного пользователем магазина

        println("Enter: 1 for Cappuccino, 2 for Americano, 3 for Espresso")

        makeCoffee(currentCoffeeShop, readln().toInt())

        println("your price is: ${currentCoffeeShop.price()}")
    }
}

fun coffeeShopInit(input: String): CoffeeMain {

    return when (input) {
        "Moscow" -> {
            return MoscowCoffeeShopClass(3.0, 4.0, 0.5)
        }
        "New York" -> {
            return NewYorkCoffeeShopClass(3.0, 4.0, 0.5)
        }
        "Exit" -> {
            println("Bye!")
            exitProcess(1)
        }
        else -> {
            throw Exception("Illegal argument exception")   // Выбрасываем исключение при неккоректном вводе
        }
    }

}

fun makeCoffee(currentCoffeeShop: CoffeeMain, typeOfCoffee: Int) {

    return when(typeOfCoffee) {
        1 -> currentCoffeeShop.makeCappuccino()
        2 -> currentCoffeeShop.makeAmericano()
        3 -> currentCoffeeShop.makeEspresso()
        else -> {
            throw Exception("Illegal argument exception") // Выбрасываем исключение при неккоректном вводе
        }
    }

}

