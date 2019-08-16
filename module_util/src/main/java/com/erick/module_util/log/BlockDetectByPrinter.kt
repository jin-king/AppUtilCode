package com.erick.module_util.log

import android.os.Looper
import android.util.Printer

/**
 * 版本编号: 1.0;
 * 创建作者: jinjian;
 * 创建时间: 2019-08-16 18:07;
 * 文件描述:
 */
object BlockDetectByPrinter {
    fun start() {
        Looper.getMainLooper().setMessageLogging(object : Printer {
            private val START = ">>>>> Dispatching"
            private val END = "<<<<< Finished"

            override fun println(x: String) {
                if (x.startsWith(START)) {
                    //开始计时
                    LogMonitor.instance.startMonitor()
                }
                if (x.startsWith(END)) {
                    //结束计时，并计算出方法执行时间
                    LogMonitor.instance.removeMonitor()
                }
            }
        })
    }
}
