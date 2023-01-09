package com.example.keyboardbug

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.keyboardbug.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.showDialog.setOnClickListener {
            MyDialogFragment().show(supportFragmentManager, null)
        }

    }
}