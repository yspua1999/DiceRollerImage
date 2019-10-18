package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }

        val countButton: Button = findViewById(R.id.count_up)
        countButton.setOnClickListener { countUp() }

        val resetButton: Button = findViewById(R.id.reset_button)
        resetButton.setOnClickListener { resetBtn() }

        val calculateButton: Button = findViewById(R.id.calculate_button)
        calculateButton.setOnClickListener { calculateTotal() }
        calculateButton.isEnabled = false
    }

    private fun rollDice() {
        //Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show()

        val resultTest1: TextView = findViewById(R.id.result_text)
        val resultTest2: TextView = findViewById(R.id.result_text1)
        val resultTest3: TextView = findViewById(R.id.result_text2)
        val calculateButton : Button = findViewById(R.id.calculate_button)

        val randomInt = Random().nextInt(6) + 1
        val randomInt1 = Random().nextInt(6) + 1
        val randomInt2 = Random().nextInt(6) + 1

        resultTest1.text = randomInt.toString()
        resultTest2.text = randomInt1.toString()
        resultTest3.text = randomInt2.toString()

        if(!calculateButton.isEnabled)
        {
            calculateButton.isEnabled = true
        }

    }

    private fun countUp() {
        val resultTest1: TextView = findViewById(R.id.result_text)
        val resultTest2: TextView = findViewById(R.id.result_text1)
        val resultTest3: TextView = findViewById(R.id.result_text2)
        val calculateButton : Button = findViewById(R.id.calculate_button)

        val resultNum1 = resultTest1.text.toString()
        val resultNum2 = resultTest2.text.toString()
        val resultNum3 = resultTest3.text.toString()

        if(resultNum1 == "Random Number 1" || resultNum2 == "Random Number 2" || resultNum3 == "Random Number 3"){
            if(resultNum1 == "Random Number 1"){
                resultTest1.text = "1"
            }
            if(resultNum2 == "Random Number 2") {
                resultTest2.text = "1"
            }
            if(resultNum3 == "Random Number 3"){
                resultTest3.text = "1"
            }
        }else{
            if(resultNum1 < "6") {
                resultTest1.text = (resultNum1.toInt() + 1).toString()
            }
            if(resultNum2 < "6") {
                resultTest2.text = (resultNum2.toInt() + 1).toString()

            }
            if(resultNum3 < "6") {
                resultTest3.text = (resultNum3.toInt() + 1).toString()
            }
        }

        if(!calculateButton.isEnabled)
        {
            calculateButton.isEnabled = true
        }
    }

    private fun resetBtn() {
        val resultTest1: TextView = findViewById(R.id.result_text)
        val resultTest2: TextView = findViewById(R.id.result_text1)
        val resultTest3: TextView = findViewById(R.id.result_text2)
        val resultTotal: TextView = findViewById(R.id.result_total)

        resultTest1.text = "0"
        resultTest2.text = "0"
        resultTest3.text = "0"
        resultTotal.text = "0"
    }

    private fun calculateTotal() {
        val resultTest1: TextView = findViewById(R.id.result_text)
        val resultTest2: TextView = findViewById(R.id.result_text1)
        val resultTest3: TextView = findViewById(R.id.result_text2)
        val resultTotal: TextView = findViewById(R.id.result_total)

        val resultNumb1 = resultTest1.text.toString().toInt()
        val resultNumb2 = resultTest2.text.toString().toInt()
        val resultNumb3 = resultTest3.text.toString().toInt()

        resultTotal.text = (resultNumb1 + resultNumb2 + resultNumb3).toString()
    }
}
