package com.example.meoryou.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.widget.Toast;

/**
 * Created by me or you on 9/13/2017.
 */

public class ThisService extends Service {
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
    public int onStartCommand(Intent intent, int flags, int startId){
        Toast.makeText(this,"Service Started", Toast.LENGTH_LONG).show();
        return START_STICKY;
    }
    public void onDestroy(){
        super.onDestroy();
        Toast.makeText(this,"Service Stopped", Toast.LENGTH_LONG).show();
    }

}
