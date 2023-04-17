package com.example.simplelistview

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val mylistview=findViewById<ListView>(R.id.listview)
        val names=arrayOf("ulira","Krack","kryss")
        val myarrayadapter:ArrayAdapter <String> =ArrayAdapter(this,android.R.layout.simple_list_item_1,names)
        mylistview.adapter=myarrayadapter
        mylistview.setOnItemClickListener { adapterView, view, position, l ->

            Toast.makeText(this,"you have clicked"+names[ position],Toast.LENGTH_LONG).show()
        }

        }

    }
