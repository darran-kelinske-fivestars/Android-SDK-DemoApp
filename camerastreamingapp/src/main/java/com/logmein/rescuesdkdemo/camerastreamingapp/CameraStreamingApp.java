package com.logmein.rescuesdkdemo.camerastreamingapp;

import android.app.Application;

import com.logmein.rescuesdk.api.RescueSDK;

public class CameraStreamingApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        RescueSDK.initializeLifecycleReporter(this);
    }
}
