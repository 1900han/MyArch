package com.megamind.myarch.mvp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.megamind.myarch.R
import kotlinx.android.synthetic.main.activity_main.*

/**
 * @description
 * @date 23:42 9/7/20
 * @author HanZhengYa
 * @since 1.0
 **/
class MvpActivity : AppCompatActivity(), Presenter.IView {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Presenter(this).init()
    }

    override fun showData(data: List<String>) {
        data1View.setText(data[0])
        data2View.setText(data[1])
    }
}