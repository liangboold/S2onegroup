package com.example.s2onegroup;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class CountDownActivity extends AppCompatActivity {
    private TextView countdown;

    private int time = 5;
    Handler handler = new Handler(){
        @Override
        public void handleMessage(@NonNull Message msg) {
            super.handleMessage(msg);
            if (time==0){
                startActivity(new Intent(CountDownActivity.this,MainActivity.class));
                finish();
            }else {
                countdown.setText("倒计时"+time+"秒");
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_count_down);
        countdown = (TextView) findViewById(R.id.countdown);
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                time--;
                handler.sendEmptyMessage(0);
            }
        },0,1000);
    }
}