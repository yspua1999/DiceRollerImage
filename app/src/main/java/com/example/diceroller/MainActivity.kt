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
        rollButton.setOnClickListener{rollDice()}
        val countButton : Button = findViewById(R.id.count_up)
        countButton.setOnClickListener{countUp()}
        val resetButton: Button = findViewById(R.id.reset_button)
        resetButton.setOnClickListener{resetBtn()}
    }

    private fun rollDice(){
        //Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show()
        val resultTest: TextView = findViewById(R.id.result_text)
        val randomInt = Random().nextInt(6)+1
        resultTest.text = randomInt.toString()
    }

    private fun countUp(){
        val resultTest : TextView = findViewById(R.id.result_text)
        val resultNum = resultTest.text.toString()

        if(resultNum == "Hello World!"){
            resultTest.text = "1"
        }else if (resultNum < "6") {
            resultTest.text = (resultNum.toInt()+1).toString()
        }
    }

    private fun resetBtn(){
        val resultTest : TextView = findViewById(R.id.result_text)
        resultTest.text = "0"
    }
}
