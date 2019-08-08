package com.katrenich.alex.kotlinfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity(), SomeListener{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initUI(savedInstanceState)
    }

    private fun initUI(savedInstanceState: Bundle?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    // example to override methods of interface in kotlin
    override fun notifyListeners(message: String?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}
