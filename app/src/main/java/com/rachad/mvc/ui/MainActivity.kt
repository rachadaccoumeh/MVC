package com.rachad.mvc.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.rachad.mvc.R
import com.rachad.mvc.pojo._____Model

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var textView: TextView
    lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView = findViewById(R.id.textView)
        button = findViewById(R.id.button)
        button.setOnClickListener(this)
    }

    private fun get____FromDatabase(): _____Model {
        return _____Model("__name", "__description", 1)
    }

    override fun onClick(p0: View?) {
        if (p0!!.id == button.id)
            textView.text = get____FromDatabase().name
    }
}