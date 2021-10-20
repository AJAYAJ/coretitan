package com.titan.coretitan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import java.lang.StringBuilder

class MainActivity : AppCompatActivity() {
    private var count: Int = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val number = 2154
//        displayTextOfNumber((number.toString()).toCharArray())
        copyALlElementsOfAnArray(arrayOf(1, 2, 3, 4, 5, 1, 3,4,2))
    }


    private fun displayTextOfNumber(charArray: CharArray) {
        var temp: CharArray = charArray;
        val stringBuilder: StringBuilder = StringBuilder()
        var singleDigitArray = arrayOf("", "one", "two", "three", "four")
        val doubleDigitArray = arrayOf("", "", "twenty", "thirty", "forty", "fifty")
        val threeDigitArray = arrayOf("hundred", "thousand")
        while (temp.isNotEmpty()) {
            val countOfArray = temp.size
            when (countOfArray) {
                in 4..4 ->
                    stringBuilder.append(singleDigitArray[temp[0] - '0'])
                        .append(" " + threeDigitArray[1])
                in 3..3 -> stringBuilder.append(" " + singleDigitArray[temp[0] - '0']).append(
                    " " + threeDigitArray[0]

                )
                in 2..2 -> stringBuilder.append(" " + doubleDigitArray[temp[0] - '0'])
                in 1..1 -> stringBuilder.append(" " + singleDigitArray[temp[0] - '0'])
            }
            temp = temp.filterIndexed { i, _ -> i !== 0 }.toCharArray()
        }
        Toast.makeText(this, "$stringBuilder", Toast.LENGTH_LONG).show()
    }

    private fun copyALlElementsOfAnArray(arrayOf: Array<Int>) {

        println(arrayOf.size)
 /*       for (i in arrayOf.indices) {
            for (j in i + 1 until arrayOf.size) {

//            println("${arrayOf[i]} ${arrayOf[j]} ")
                if (arrayOf[i] == arrayOf[j]){
//            println("${arrayOf[i]} ${arrayOf[j]} ${arrayOf[i] == arrayOf[j]}")
                    count += 1;
                }
            }
            if (count>1)
            println(" ${arrayOf[i]} present in $count times")
            count = 1 ;
        }*/
        for (i in arrayOf.size-1 downTo 0){
            println(" ${arrayOf[i]} ")
        }
    }

}