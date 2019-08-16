package com.erick.module_util.log

import android.os.Handler
import android.os.HandlerThread
import android.os.Looper
import android.util.Log


/**
 * 版本编号: 1.0;
 * 创建作者: jinjian;
 * 创建时间: 2019-08-16 18:23;
 * 文件描述:
 */
class LogMonitor private constructor() {
    private val mIoHandler: Handler

    init {
        val logThread = HandlerThread("log")
        logThread.start()
        mIoHandler = Handler(logThread.looper)
    }

    /**
     * 开始计时
     */
    fun startMonitor() {
        mIoHandler.postDelayed(mLogRunnable, TIME_BLOCK)
    }

    /**
     * 停止计时
     */
    fun removeMonitor() {
        mIoHandler.removeCallbacks(mLogRunnable)
    }

    companion object {
        private val TAG = LogMonitor::class.java.simpleName
        val instance = LogMonitor()
        private val TIME_BLOCK = 300L

        private val mLogRunnable = Runnable {
            //打印出执行的耗时方法的栈消息
            val sb = StringBuilder()
            val stackTrace = Looper.getMainLooper().thread.stackTrace
            for (s in stackTrace) {
                sb.append(s.toString())
                sb.append("\n")
            }
            Log.d(TAG, sb.toString())
        }
    }
}
