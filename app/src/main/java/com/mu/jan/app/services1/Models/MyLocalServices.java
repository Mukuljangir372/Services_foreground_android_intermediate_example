package com.mu.jan.app.services1.Models;

import android.app.Service;
import android.content.Intent;
import android.drm.DrmStore;
import android.graphics.Bitmap;
import android.media.MediaPlayer;
import android.os.Binder;
import android.os.IBinder;
import android.provider.MediaStore;
import android.widget.Toast;

import androidx.annotation.Nullable;

import static android.widget.Toast.LENGTH_SHORT;

public class MyLocalServices extends Service {


    //when callback when services are created
    @Override
    public void onCreate() {
        super.onCreate();
        Toast.makeText(this,"service created", LENGTH_SHORT).show();
    }

    //this callback triggered when bind to service
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
    //this callback triggered when unbind to service
    @Override
    public boolean onUnbind(Intent intent) {
        return super.onUnbind(intent);
    }

    //this callback triggered when service starts
    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        /**
         * it has three parameters,
         * 1. intent that you pass
         * 2. flags used for what you want to indicate
         * 3. Sometimes, there are multiple calls to same service, If your want to stop a call to service, it can be very
         * difficult for you. To prevent from this, you have to use startId
         */

      //when service start on foreground or main thread

        /**
         * START_STICKY - Sometimes, services stopped by system in meantime. This is used for starting services again.
         * START_NOT_STICKY - When services automatically stopped by system, If you use this, services not start again.
         * START_REDELIVER_INTENT - When services stopped by system or stopped itself, the original intent that you pass, again redeliver to it and start processing again.
         */
        Toast.makeText(this,"service started", LENGTH_SHORT).show();


     return START_STICKY;
    }

    //when service destroyed
    @Override
    public void onDestroy() {
        super.onDestroy();
        Toast.makeText(this,"service stopped ", LENGTH_SHORT).show();
    }

}
