package com.example.muhammed.myapplication3

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {


    lateinit var editText1 : EditText
    lateinit var editText2 : EditText
    lateinit var textView1 : TextView
    lateinit var textView2 : TextView
    lateinit var textView3 : TextView
    lateinit var btn1 : Button
    lateinit var btn2 : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         editText1  = findViewById(R.id.firstname)
         editText2  = findViewById(R.id.lastname)
         textView1  = findViewById(R.id.textViewfirstname)
         textView2  = findViewById(R.id.textViewlastname)
        textView3  = findViewById(R.id.textView3)
         btn1       = findViewById(R.id.button)
         btn2       = findViewById(R.id.button2)

        btn1.setOnClickListener {
            var firstname = editText1.text
            textView1.text = "this is btn1 $firstname"
        }

        btn2.setOnClickListener {
            var lasttname = editText2.text
            textView2.text = "this is btn2 $lasttname"
        }


        textView3.setOnClickListener {
            var firstname = editText1.text
            var lasttname = editText2.text

            textView3.text = "you clicked !!! $firstname  $lasttname "
        }


    }






}
