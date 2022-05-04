package com.example.my_unit_converter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.my_unit_converter.databinding.ActivityMainBinding
import java.math.RoundingMode
import java.text.DecimalFormat

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttReset.setOnClickListener {
            binding.inputResult.text = "0"
            binding.outputResult.text = "0"
        }
        binding.buttCancel.setOnClickListener {
            binding.inputResult.text = ""
        }
//        getting the buttons to display
        binding.butt0.setOnClickListener {
            binding.inputResult.text = addInput("0")
            binding.outputResult.text = getResult().toString()
        }
        binding.butt1.setOnClickListener {
            binding.inputResult.text = addInput("1")
            binding.outputResult.text = getResult().toString()
        }
        binding.butt2.setOnClickListener {
            binding.inputResult.text = addInput("2")
            binding.outputResult.text = getResult().toString()
        }
        binding.butt3.setOnClickListener {
            binding.inputResult.text = addInput("3")
            binding.outputResult.text = getResult().toString()
        }
        binding.butt4.setOnClickListener {
            binding.inputResult.text = addInput("4")
            binding.outputResult.text = getResult().toString()
        }
        binding.butt5.setOnClickListener {
            binding.inputResult.text = addInput("5")
            binding.outputResult.text = getResult().toString()
        }
        binding.butt6.setOnClickListener {
            binding.inputResult.text = addInput("6")
            binding.outputResult.text = getResult().toString()
        }
        binding.butt7.setOnClickListener {
            binding.inputResult.text = addInput("7")
            binding.outputResult.text = getResult().toString()
        }
        binding.butt8.setOnClickListener {
            binding.inputResult.text = addInput("8")
            binding.outputResult.text = getResult().toString()
        }
        binding.butt9.setOnClickListener {
            binding.inputResult.text = addInput("9")
            binding.outputResult.text = getResult().toString()
        }
        binding.butt00.setOnClickListener {
            binding.inputResult.text = addInput("00")
            binding.outputResult.text = getResult().toString()
        }
        binding.buttdot.setOnClickListener {
            binding.inputResult.text = addInput(".")
        }

        binding.arrow.setOnClickListener {
            var inputtext = binding.inputResult.text
            if (inputtext.isNotEmpty()) {
                inputtext.toString().dropLast(inputtext.lastIndex)
            }

        }

    }

    private fun addInput(buttonValue: String): String {
        return "${binding.inputResult.text}$buttonValue"
    }

    private fun getResult(): Double {
        val inputText = binding.inputResult.text.toString().toDouble()
        return if (inputText == 0.0) {

            roundOffDecimal(0.0)
        } else {
            var result = inputText * 3.28084
            roundOffDecimal(result)
        }
    }

    private fun roundOffDecimal(number: Double): Double {
        var df = DecimalFormat("#.###")
        df.roundingMode = RoundingMode.CEILING
        return df.format(number).toDouble()
    }


}
