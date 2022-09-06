package com.example.meuaplicativo00001

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun chama001(view: View) {
        val intent = Intent(this, MainActivity2::class.java)
        startActivity(intent)
    }

    fun chama002(view: View) {
        val intent = Intent(this, MainActivity3::class.java)
        startActivity(intent)
    }

    fun chama003(view: View) {
        val intent = Intent(this, MainActivity4::class.java)
        startActivity(intent)
    }

    fun chama004(view: View) {
        val intent = Intent(this, MainActivity5::class.java)
        startActivity(intent)
    }

    fun chama005(view: View) {
        val intent = Intent(this, MainActivity6::class.java)
        startActivity(intent)
    }

    fun chama006(view: View) {
        val intent = Intent(this, MainActivity7::class.java)
        startActivity(intent)
    }

    fun chama007(view: View) {
        val intent = Intent(this, MainActivity8::class.java)
        startActivity(intent)
    }

}