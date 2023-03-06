package ru.ennesterov.coffeemachine.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ru.ennesterov.coffeemachine.R
import ru.ennesterov.coffeemachine.databinding.FragmentNewYorkCoffeeShopBinding

class NewYorkCoffeeShopFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       val binding = FragmentNewYorkCoffeeShopBinding.inflate(layoutInflater, container, false)

        return binding.root
    }

    companion object {

    }
}