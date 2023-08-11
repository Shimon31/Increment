package com.example.shimon.increment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.example.shimon.increment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding


    val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel.myScore.observe(this){
            setValueToview(it)
        }

        binding.InBTN.setOnClickListener {
        //Fire and Forget
            viewModel.increment()

        }


    }

    private fun setValueToview(i: Int) {

        binding.InTV.text = "Score: $i"

    }
}