package com.erick.kkk.singleton

import android.content.Context

/**
 * 版本编号: 1.0;
 * 创建作者: jinjian;
 * 创建时间: 2019-08-22 19:55;
 * 文件描述:
 */
class SampleManager private constructor(context: Context) {
    init {
    }

    companion object : SingletonHolder<SampleManager, Context>(::SampleManager)

    fun test(){

    }
}