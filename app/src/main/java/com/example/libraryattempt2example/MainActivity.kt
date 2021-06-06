package com.example.libraryattempt2example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.libraryattempt2.logDebug

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        logDebug("whatever")
    }
}