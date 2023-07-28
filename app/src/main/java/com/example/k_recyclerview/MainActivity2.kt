package com.example.k_recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var ind=intent.getStringExtra("name")
        Toast.makeText(this, "$ind", Toast.LENGTH_SHORT).show()

    }
}