package com.megamind.myarch.mvvm

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.megamind.myarch.R
import kotlinx.android.synthetic.main.activity_main.*

class MvvmActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ViewModel(data1View, data2View).init()
    }
}