package com.megamind.myarch.mvvm

import android.widget.EditText
import androidx.core.widget.doAfterTextChanged

/**
 * @description
 * @date 00:23 9/8/20
 * @author HanZhengYa
 * @since 1.0
 **/
class ViewBinder {
    companion object {
        fun bind(editText: EditText, stringAttr: StringAttr) {
            editText.doAfterTextChanged {
                if (stringAttr.value != it.toString()) {
                    stringAttr.value = it.toString()
                    println("表现数据通知内存啦！")
                }
            }

            stringAttr.onChangeListener = object : StringAttr.OnChangeListener {
                override fun onChange(newValue: String?) {
                    if (editText.text.toString() != newValue) {
                        editText.setText(newValue ?: "")
                        println("内存通知表现数据啦！")
                    }
                }
            }
        }
    }
}