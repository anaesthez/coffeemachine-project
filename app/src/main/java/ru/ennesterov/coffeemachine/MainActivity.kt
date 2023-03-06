package ru.ennesterov.coffeemachine

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import ru.ennesterov.coffeemachine.databinding.ActivityMainBinding
import ru.ennesterov.coffeemachine.screens.MoscowCoffeeShopFragment
import ru.ennesterov.coffeemachine.screens.NewYorkCoffeeShopFragment
import ru.ennesterov.coffeemachine.screens.StartFragment
import ru.ennesterov.coffeemachine.screens.contract.HasCustomTitle
import ru.ennesterov.coffeemachine.screens.contract.Navigator

class MainActivity: AppCompatActivity(), Navigator {

    private lateinit var binding: ActivityMainBinding

    private val currentFragment: Fragment
        get() = supportFragmentManager.findFragmentById(R.id.fragmentContainer)!!

    private val fragmentListener = object : FragmentManager.FragmentLifecycleCallbacks() {
        override fun onFragmentViewCreated(fm: FragmentManager, f: Fragment, v: View, savedInstanceState: Bundle?) {
            super.onFragmentViewCreated(fm, f, v, savedInstanceState)
            updateUi()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater).also { setContentView(it.root) }
        setSupportActionBar(binding.toolbar)

        if(savedInstanceState == null) {
            supportFragmentManager
                .beginTransaction()
                .add(R.id.fragmentContainer, StartFragment())
                .commit()
        }

        supportFragmentManager.registerFragmentLifecycleCallbacks(fragmentListener, false)

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressedDispatcher.onBackPressed()
        return true
    }

    override fun onDestroy() {
        super.onDestroy()
        supportFragmentManager.unregisterFragmentLifecycleCallbacks(fragmentListener)
    }

    override fun showMoscowCoffeeShop() {
        launchFragment(MoscowCoffeeShopFragment())
    }

    override fun showNewYorkCoffeeShop() {
        launchFragment(NewYorkCoffeeShopFragment())
    }

    override fun goBack() {
        onBackPressedDispatcher.onBackPressed()
    }

    private fun updateUi() {

        val fragment = currentFragment

        if(fragment is HasCustomTitle) {
            binding.toolbar.title = getString(fragment.getTitleRes())
        } else {
            binding.toolbar.title = getString(R.string.app_name)
        }

        if (supportFragmentManager.backStackEntryCount > 0) {
            supportActionBar?.setDisplayHomeAsUpEnabled(true)
            supportActionBar?.setDisplayShowHomeEnabled(true)
        } else {
            supportActionBar?.setDisplayHomeAsUpEnabled(false)
            supportActionBar?.setDisplayShowHomeEnabled(false)
        }

    }

    private fun launchFragment(fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .addToBackStack(null)
            .replace(R.id.fragmentContainer, fragment)
            .commit()
    }

}
