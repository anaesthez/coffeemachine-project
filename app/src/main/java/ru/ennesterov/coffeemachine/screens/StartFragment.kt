package ru.ennesterov.coffeemachine.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ru.ennesterov.coffeemachine.R
import ru.ennesterov.coffeemachine.databinding.FragmentStartBinding
import ru.ennesterov.coffeemachine.screens.contract.navigator

class StartFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentStartBinding.inflate(inflater, container, false)

        binding.moscowButton.setOnClickListener { onMoscowButtonPressed() }
        binding.newYorkButton.setOnClickListener { onNewYorkButtonPressed() }
        binding.exitButton.setOnClickListener { onExitButtonPressed() }

        return binding.root
    }

    private fun onMoscowButtonPressed() {
        navigator().showMoscowCoffeeShop()
    }

    private fun onNewYorkButtonPressed() {
        navigator().showNewYorkCoffeeShop()
    }

    private fun onExitButtonPressed() {
        navigator().goBack()
    }

    companion object {

    }
}