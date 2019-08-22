package com.erick.module_logcat.util;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import com.erick.module_logcat.service.LogFileProvider;

import java.io.File;

public class LogFileProviderUtil {

    public static Uri getUri(Context context, File file) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            return LogFileProvider.getUriForFile(context, "com.erick.module_logcat" + ".fileProvider", file);
        } else {
            return Uri.fromFile(file);
        }
    }

}
