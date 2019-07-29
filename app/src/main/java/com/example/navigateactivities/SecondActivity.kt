package com.example.navigateactivities

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        var bundle: Bundle? = intent.extras
        var message = bundle!!.getString("user_message")
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();

    }
}

