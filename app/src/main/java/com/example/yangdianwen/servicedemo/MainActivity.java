package com.example.yangdianwen.servicedemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Intent intent =new Intent(this,MyService.class);
        //点击开启服务
        findViewById(R.id.btn_start).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startService(intent);
            }
        });
        //点击停止服务
        findViewById(R.id.btn_stop).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                stopService(intent);
            }
        });
    }
}
