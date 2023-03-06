package ru.ennesterov.coffeemachine.screens.contract

import androidx.fragment.app.Fragment

fun Fragment.navigator(): Navigator {
    return requireActivity() as Navigator
}

interface Navigator {

    fun showMoscowCoffeeShop()

    fun showNewYorkCoffeeShop()

    fun goBack()

}