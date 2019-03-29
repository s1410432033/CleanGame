package com.example.huanghuai.cleangamedemo.ui.Main;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Message;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.huanghuai.cleangamedemo.R;
import com.example.huanghuai.cleangamedemo.base.BaseActivity;
import com.example.huanghuai.cleangamedemo.ui.LogIn.LoginFragment;

public class MainActivity extends BaseActivity {
public static final int GOTO_LOG = 99;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        handler.sendEmptyMessageDelayed(GOTO_LOG,3000);
    }
    @SuppressLint("HandlerLeak")
    private Handler handler = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            switch (msg.what){
                case GOTO_LOG:{
                    FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.main,new LoginFragment()).commit();
                    break;
                }
                default:{
                    break;
                }
            }
        }
    };
}
