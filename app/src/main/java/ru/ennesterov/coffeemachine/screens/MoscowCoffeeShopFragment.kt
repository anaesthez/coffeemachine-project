package ru.ennesterov.coffeemachine.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ru.ennesterov.coffeemachine.R
import ru.ennesterov.coffeemachine.databinding.FragmentMoscowCoffeeShopBinding
import ru.ennesterov.coffeemachine.screens.contract.HasCustomTitle

class MoscowCoffeeShopFragment : Fragment(), HasCustomTitle {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentMoscowCoffeeShopBinding.inflate(layoutInflater, container, false)

        return binding.root
    }

    companion object {

    }

    override fun getTitleRes(): Int = R.string.moscow_title
}