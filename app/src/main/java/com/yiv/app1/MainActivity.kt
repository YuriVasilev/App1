package com.yiv.app1

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.yiv.app1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonLogin.setOnClickListener {

            val emailText = binding.editTextTextEmailAddress.text.toString()
            val passText = binding.editTextTextPassword.text.toString()

            if (emailText == "ra@admin.ru" && passText == "123"){
                showToast("Хорошо")
            }
            else {
                showToast("Плохо")
            }

        }

    }

    private fun showToast(text: String) {
        Toast.makeText(this, text, Toast.LENGTH_LONG).show()
    }

}