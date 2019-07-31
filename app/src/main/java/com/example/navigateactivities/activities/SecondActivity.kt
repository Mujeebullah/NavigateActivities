package com.example.navigateactivities.activities

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.navigateactivities.Constants
import com.example.navigateactivities.R
import com.example.navigateactivities.showToast

class SecondActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        var bundle: Bundle? = intent.extras
        var message = bundle!!.getString(Constants.USER_MESSAGE_KEY)
        showToast(message!!)
        showToast("This is demo of extension functins")

    }
}

