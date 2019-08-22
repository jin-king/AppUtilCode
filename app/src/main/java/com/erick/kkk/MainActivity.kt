package com.erick.kkk

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.erick.module_logcat.LogcatViewer
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    companion object {
        val TAG = MainActivity::class.java.simpleName
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        method()

        btnOpenLogcat.setOnClickListener {
            LogcatViewer.showLogcatLoggerView(this)
        }

        btnCloseLogcat.setOnClickListener {
            LogcatViewer.closeLogcatLoggerView(this)
        }
    }

    fun method() {
        Thread.sleep(400)
        Thread(Runnable {
            while (true) {
                Log.i(TAG, "测试log....")
                Log.e(TAG, "test log ....")
                Thread.sleep(500)
            }
        }).start()
    }
}
