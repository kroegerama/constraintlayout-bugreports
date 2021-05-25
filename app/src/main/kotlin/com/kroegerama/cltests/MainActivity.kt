package com.kroegerama.cltests

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity(R.layout.activity_main) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        findViewById<MaterialButton>(R.id.btnWrapContent).startOnClick<AcWrapContentBug>()
        findViewById<MaterialButton>(R.id.btnSwipe).startOnClick<AcSwipeBug>()
        findViewById<MaterialButton>(R.id.btnSpring).startOnClick<AcSpringBug>()
    }

    private inline fun <reified T : Activity> View.startOnClick() = setOnClickListener {
        startActivity(Intent(this@MainActivity, T::class.java))
    }
}

class AcWrapContentBug : AppCompatActivity(R.layout.wrap_content_bug)

class AcSwipeBug : AppCompatActivity(R.layout.swipe_bug)

class AcSpringBug : AppCompatActivity(R.layout.spring_bug)