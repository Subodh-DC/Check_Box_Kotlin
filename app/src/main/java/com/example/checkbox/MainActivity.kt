package com.example.checkbox

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var check1:CheckBox
    lateinit var check2:CheckBox
    lateinit var check3:CheckBox
    lateinit var text2:TextView
    lateinit var text3:TextView
    lateinit var text4:TextView
    lateinit var btn:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        check1=findViewById(R.id.checkbox1)
        check2=findViewById(R.id.checkbox2)
        check3=findViewById(R.id.checkbox3)
        text2=findViewById(R.id.textview2)
        text3=findViewById(R.id.textview3)
        text4=findViewById(R.id.textview4)
        btn=findViewById(R.id.Button1)

        btn.setOnClickListener {
            var sum=0
            if (check1.isChecked){
                val amount=text2.text.toString()
                sum=sum+amount.toInt()
            }
            if (check2.isChecked){
                val amount=text3.text.toString()
                sum=sum+amount.toInt()
            }
            if (check3.isChecked){
                val amount=text4.text.toString()
                sum=sum+amount.toInt()
            }
            Toast.makeText(this, "Sum is: "+sum, Toast.LENGTH_SHORT).show()
        }

    }
}