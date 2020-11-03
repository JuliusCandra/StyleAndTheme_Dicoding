package com.dev_candra.styleandtheme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initToolabar()
        button_buy.apply {
            setOnClickListener {
                Toast.makeText(this@MainActivity,"Anda mengklik tombol button",Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun initToolabar(){
        supportActionBar?.title = "Candra Julius Sinaga"
        supportActionBar?.subtitle = "Latihan Style Theme"
    }
}