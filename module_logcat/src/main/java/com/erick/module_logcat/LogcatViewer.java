/**
 * Copyright (C) 2016  Sandeep Fatangare <sandeep@fatangare.info>
 * <p>
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * <p>
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * <p>
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.erick.module_logcat;

import android.content.Context;
import com.erick.module_logcat.service.LogcatViewerFloatingView;
import com.erick.module_logcat.ui.StandOutWindow;

/**
 * This class will launch {@link LogcatViewerFloatingView} view.
 */
public class LogcatViewer {
    /**
     * Launch {@link LogcatViewerFloatingView} view.
     *
     * @param context context.
     */
    public static void showLogcatLoggerView(Context context) {
        StandOutWindow.closeAll(context, LogcatViewerFloatingView.class);
        StandOutWindow.show(context, LogcatViewerFloatingView.class, StandOutWindow.DEFAULT_ID);
    }

    /**
     * Close  {@link LogcatViewerFloatingView} view.
     *
     * @param context context.
     */
    public static void closeLogcatLoggerView(Context context) {
        StandOutWindow.closeAll(context, LogcatViewerFloatingView.class);
    }
}
