package com.example.navigateactivities.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.navigateactivities.Constants
import com.example.navigateactivities.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    companion object{
        private val TAG: String = MainActivity::class.java.simpleName
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG, "on create method is called")
        btnSecondActivity.setOnClickListener {
            var intent = Intent(this, SecondActivity::class.java)
            var message:String? = editMessage.text.toString();
            intent.putExtra(Constants.USER_MESSAGE_KEY, message)
            startActivity(intent)
        }
        btnSharToOtherApp.setOnClickListener {
            var message :String? = editMessage.text.toString()
            var intent = Intent()
            intent.action = Intent.ACTION_SEND
            intent.putExtra(Intent.EXTRA_TEXT, message)
            intent.type = "text/plain"
            startActivity(Intent.createChooser(intent, "Share with:"))
        }

        btnRecyclerViewDemo.setOnClickListener {
            var intent = Intent(this, HobbiesActivity::class.java)
            startActivity(intent)
        }
    }
}
