package com.megamind.myarch.mvc

import android.content.Context
import android.util.AttributeSet
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.activity_main_mvc.view.*

/**
 * @description
 * @date 23:51 9/7/20
 * @author HanZhengYa
 * @since 1.0
 **/
class MvcView(context: Context?, attrs: AttributeSet?) : LinearLayout(context, attrs) {
    fun showData(data: List<String>) {
        data1View.text = data[0]
        data2View.text = data[1]
    }
}