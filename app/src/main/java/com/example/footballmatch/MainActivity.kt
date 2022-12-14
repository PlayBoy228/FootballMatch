package com.example.footballmatch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.premierleaguefixtures.FirstFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction()
            .replace(R.id.place_holder, FirstFragment.newInstance()).commit();

    }
}