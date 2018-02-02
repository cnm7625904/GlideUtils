package com.glideutils.App;

import android.app.Application;
import android.content.Context;

/**
 * Created by Administrator。 on 2018/1/22.
 */

public class MyApplication extends Application {
    private static Context context;
    public MyApplication() {
    }
    private static class singleton{
        private static final MyApplication INSTANCE=new MyApplication();
    }
    public static final MyApplication getInstance(){
        return singleton.INSTANCE;
    }
    @Override
    public void onCreate() {
        super.onCreate();
        context=getApplicationContext();
    }
    public static  Context getContext(){
        return context;
    }
}
