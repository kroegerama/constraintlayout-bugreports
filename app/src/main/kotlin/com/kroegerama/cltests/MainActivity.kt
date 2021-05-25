package com.kroegerama.cltests

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity(R.layout.activity_main) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        findViewById<MaterialButton>(R.id.btnWrapContent).setOnClickListener {
            start<AcWrapContentBug>()
        }
    }

    private inline fun <reified T : Activity> start() {
        startActivity(Intent(this@MainActivity, T::class.java))
    }
}

class AcWrapContentBug : AppCompatActivity(R.layout.wrap_content_bug)