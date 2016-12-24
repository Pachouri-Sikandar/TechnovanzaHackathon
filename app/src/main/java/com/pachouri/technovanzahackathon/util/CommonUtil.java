package com.pachouri.technovanzahackathon.util;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by ankit on 12/24/16.
 */
public class CommonUtil {
    public static void showToastMessage(Context context, String message) {
        if (context != null) {
            Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
        }
    }
}
