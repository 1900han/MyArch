package com.megamind.myarch.mvvm

import android.widget.EditText
import com.megamind.myarch.DataCenter

/**
 * @description
 * @date 00:21 9/8/20
 * @author HanZhengYa
 * @since 1.0
 **/
class ViewModel(val data1View: EditText, val data2View: EditText) {

    var data1: StringAttr = StringAttr()
    var data2: StringAttr = StringAttr()

    init {
        ViewBinder.bind(data1View, data1)
        ViewBinder.bind(data2View, data2)
    }

    fun init() {
        val data = DataCenter.getData()
        data1.value = data[0]
        data2.value = data[1]
    }

}