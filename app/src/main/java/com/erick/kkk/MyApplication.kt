package com.erick.kkk

import android.app.Application
import com.erick.kkk.singleton.SingletonLazy
import com.erick.module_util.log.BlockDetectByPrinter

/**
 * 版本编号: 1.0;
 * 创建作者: jinjian;
 * 创建时间: 2019-08-16 18:30;
 * 文件描述:
 */
class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        BlockDetectByPrinter.start()
        SingletonLazy.INSTANCE.test()
    }
}