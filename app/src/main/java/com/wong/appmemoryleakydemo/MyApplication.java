package com.wong.appmemoryleakydemo;

import android.app.Activity;
import android.app.Application;
import android.os.StrictMode;

import java.util.ArrayList;

/**
 * @author WongKyunban
 * description
 * created at 2019-04-04 下午6:58
 * @version 1.0
 */
public class MyApplication extends Application {


    public static final boolean IS_DEBUG = true;
    public static ArrayList<Activity> sLeakyActivities = new ArrayList<Activity>();

    @Override
    public void onCreate() {
        StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder().detectActivityLeaks().penaltyLog().build());
//        StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder().setClassInstanceLimit(LeakActivity.class,1).penaltyLog().build());

        super.onCreate();
    }
}
