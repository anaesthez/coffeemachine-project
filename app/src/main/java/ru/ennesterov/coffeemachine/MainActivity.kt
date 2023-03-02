import ru.ennesterov.coffeemachine.CoffeeMain
import ru.ennesterov.coffeemachine.MoscowClass
import ru.ennesterov.coffeemachine.NewYork
import kotlin.system.exitProcess
fun main() {
    val moscowCoffeeShop = MoscowClass(3.0,4.0,0.5)
    val newYorkCoffeeShop = NewYork(3.0,4.0,0.5)
    while (true) {
        println("Enter city:\n 1.Moscow \n 2. NewYork \n" +
                " 0. Exist ")
        val city = readLine()?.toInt()
        val currentCoffeeShop = when (city) {
            1 -> {
                moscowCoffeeShop
            }
            2 -> {
                newYorkCoffeeShop
            }
            0 -> {
                break
            }
            else -> {
                println("Error")
                exitProcess(1)
            }
        }
        println(
            "Enter coffee:\n 1.Cappuccino \n 2. Americano \n" +
                    " 3. Espresso"
        )
        val coffee = readLine()?.toInt()
        val currentCoffee = when(coffee) {
            1 -> {
                currentCoffeeShop.makeCappuccino()
            }
            2 -> {
                currentCoffeeShop.makeAmericano()
            }
            3 -> {
                currentCoffeeShop.makeEspresso()
            }
            else -> {
                println("Error")
                exitProcess(1)

            }
        }
        println("your price is: ${currentCoffeeShop.price()}")
    }
}