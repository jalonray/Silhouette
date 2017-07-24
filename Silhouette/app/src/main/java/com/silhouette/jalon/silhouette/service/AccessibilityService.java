package com.silhouette.jalon.silhouette.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;

/**
 * Created by JayRay on 24/07/2017.
 * Info:
 */

public class AccessibilityService extends Service {
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
