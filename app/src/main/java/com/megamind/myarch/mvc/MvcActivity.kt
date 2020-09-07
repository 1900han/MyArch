package com.megamind.myarch.mvc

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.megamind.myarch.DataCenter
import com.megamind.myarch.R
import kotlinx.android.synthetic.main.activity_main_mvc.*

class MvcActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_mvc)

        val data = DataCenter.getData()
        dataView.showData(data)
    }
}