package com.example.toastexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.toastify.Toastify


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btn1).setOnClickListener {
            Toastify.showToast(this, Toastify.SUCCESS, "My success toast", Toast.LENGTH_SHORT)
        }

        findViewById<Button>(R.id.btn2).setOnClickListener {
            Toastify.showToast(this, Toastify.FAILED, "My failure toast", Toast.LENGTH_SHORT)
        }

        findViewById<Button>(R.id.btn3).setOnClickListener {
            Toastify.showToast(this, Toastify.INFO, "My info toast", Toast.LENGTH_SHORT)
        }

        findViewById<Button>(R.id.btn4).setOnClickListener {
            Toastify.showToast(this, Toastify.DEFAULT, "My default toast", Toast.LENGTH_SHORT)
        }


        Toastify.showCustomizedToast(this, "My customized toast",
            R.drawable.ic_info_outline, R.color.design_default_color_secondary_variant,
            Toast.LENGTH_SHORT)

    }
}