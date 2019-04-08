package com.example.huanghuai.cleangamedemo.ui.SettingRoom;

import android.content.Context;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import com.example.huanghuai.cleangamedemo.base.BasePresenter;
import com.example.huanghuai.cleangamedemo.base.BaseView;
import com.example.huanghuai.cleangamedemo.ui.LogIn.LoginContract;

/**
 * Created by huanghuai on 2019/3/29.
 */

public interface SettingContract {
    interface View extends BaseView {
        void setRoom();

    }
    interface Presenter<V extends SettingContract.View> extends BasePresenter<V> {
//        int toDouble(int input) ;
        void createRoom();
        void setRoomWidget(EditText tName, Spinner teamAmount, Spinner memberAmount);
        void roomInfo();

//        String tName, int teamAmount, int memberAmount
    }
}
