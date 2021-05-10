package com.example.toastify

import android.annotation.SuppressLint
import android.content.Context
import android.os.Build
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat

class Toastify() {

    companion object {


        const val SUCCESS = 1
        const val FAILED = 2
        const val INFO = 3
        const val DEFAULT = 4

        @SuppressLint("InflateParams")
        fun showToast(context: Context, type : Int, toastText: String, duration: Int) {
            val layoutInflater : LayoutInflater = LayoutInflater.from(context)
            val layout : View = layoutInflater.inflate(R.layout.layout_taostify, null)
            val textView : TextView = layout.findViewById(R.id.text)
            textView.text = toastText
            var drawable = 0
            val color: Int
            when (type) {
                1 -> {
                    drawable = R.drawable.ic_done_outline
                    color = R.color.green
                }
                2 -> {
                    drawable = R.drawable.ic_cancel
                    color = R.color.red
                }
                3 -> {
                    drawable = R.drawable.ic_info_outline
                    color = R.color.blue
                }
                else -> {
                    drawable = 0
                    color = R.color.black
                }
            }

            textView.setCompoundDrawablesWithIntrinsicBounds(drawable, 0, 0, 0)
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP)
                layout.findViewById<LinearLayout>(R.id.parent).backgroundTintList =
                    ContextCompat.getColorStateList(context, color)

            val toast = Toast(context)
            toast.duration = duration
            toast.view = layout
            toast.show()

        }


        fun showCustomizedToast(context: Context, toastText: String, toastIcon: Int, toastColor : Int, duration: Int) {
            val layoutInflater : LayoutInflater = LayoutInflater.from(context)
            val layout : View = layoutInflater.inflate(R.layout.layout_taostify, null)
            val textView : TextView = layout.findViewById(R.id.text)
            textView.text = toastText

            textView.setCompoundDrawablesWithIntrinsicBounds(toastIcon, 0, 0, 0)
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP)
                layout.findViewById<LinearLayout>(R.id.parent).backgroundTintList =
                    ContextCompat.getColorStateList(context, toastColor)

            val toast = Toast(context)
            toast.duration = duration
            toast.view = layout
            toast.show()

        }


    }
}