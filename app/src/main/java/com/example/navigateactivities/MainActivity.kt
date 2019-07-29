package com.example.navigateactivities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnSecondActivity.setOnClickListener {
            var intent = Intent(this, SecondActivity::class.java)
            var message:String? = editMessage.text.toString();
            intent.putExtra("user_message", message)
            startActivity(intent)
        }
        btnSharToOtherApp.setOnClickListener {
            var message :String? = editMessage.text.toString()
            var intent = Intent()
            intent.action = Intent.ACTION_SEND
            intent.putExtra(Intent.EXTRA_TEXT, message)
            intent.type = "text/plain"
            startActivity(intent)
            //startActivity(Intent.createChooser(intent, "Share with:"))
        }
    }
}
