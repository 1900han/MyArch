package com.megamind.myarch.mvp

import com.megamind.myarch.DataCenter

/**
 * @description
 * @date 23:42 9/7/20
 * @author HanZhengYa
 * @since 1.0
 **/
class Presenter(private val iView: IView) {
    fun init() {
        val data = DataCenter.getData()
        iView.showData(data)
    }

    interface IView {
        fun showData(data: List<String>)
    }
}