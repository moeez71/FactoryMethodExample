package uk.co.planetbeyond.factorymethod

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import uk.co.planetbeyond.factorymethod.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var isChanged: Boolean =false
    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Set button click
        binding.coffeeBtn.setOnClickListener{
            changeCoffee(it)
        }

    }

    /**
     * Change coffee recipe and name when button is clicked
     */
    private fun changeCoffee(view: View){
        var factory: Coffee
        if (isChanged){
            factory = CoffeeFactory.getCoffee(CoffeeFactory.Type.AMERICANO)
            isChanged = false
        }else{
            factory = CoffeeFactory.getCoffee(CoffeeFactory.Type.LATTE)
            isChanged = true
        }

        changeCoffeeType(factory.recipe(), factory.name())
    }

    /**
     * Method that changes the coffee type
     */
    private fun changeCoffeeType(recipe: String, name: String){


        binding.coffeeRecipe.text = recipe
        binding.coffeeName.text = name
    }
}