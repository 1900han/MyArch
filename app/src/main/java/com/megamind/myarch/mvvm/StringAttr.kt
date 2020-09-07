package com.megamind.myarch.mvvm

/**
 * @description
 * @date 00:29 9/8/20
 * @author HanZhengYa
 * @since 1.0
 **/
class StringAttr {
    var value: String? = null
        set(value) {
            field = value
            onChangeListener?.onChange(value)
        }

    var onChangeListener: OnChangeListener? = null

    interface OnChangeListener {
        fun onChange(newValue: String?)
    }
}