package com.wong.appmemoryleakydemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class LeakActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leak);
        if(MyApplication.IS_DEBUG){
            MyApplication.sLeakyActivities.add(this);
        }
    }
}
