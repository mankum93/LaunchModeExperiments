package com.example.launchmodesexperiments

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.action_launch_activity2).setOnClickListener {
            startActivity(Intent(this, Activity2::class.java)
                .setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP))
        }

        startActivity(Intent(this, Activity2::class.java))
    }
}