package com.erick.kkk.singleton;


import android.util.Log;

/**
 * 版本编号: 1.0;
 * 创建作者: jinjian;
 * 创建时间: 2019-08-22 15:14;
 * 文件描述:
 */
public final class SingletonLazy {
    private static final String TAG = SingletonLazy.class.getSimpleName();

    public static SingletonLazy INSTANCE;

    private SingletonLazy() {
        INSTANCE = this;
    }

    static {
        new SingletonLazy();
    }


    public void test() {
    }
}
