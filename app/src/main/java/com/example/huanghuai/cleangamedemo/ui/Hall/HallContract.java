package com.example.huanghuai.cleangamedemo.ui.Hall;

import com.example.huanghuai.cleangamedemo.base.BasePresenter;
import com.example.huanghuai.cleangamedemo.base.BaseView;
import com.example.huanghuai.cleangamedemo.ui.LogIn.LoginContract;

import java.util.ArrayList;

/**
 * Created by huanghuai on 2019/3/28.
 */

public interface HallContract {

    interface View extends BaseView {
        void createRoomBtn();
        void setRecycleView(ArrayList roomNameArray);
    }
    interface Presenter<V extends HallContract.View> extends BasePresenter<V> {
        void createHall();
    }
}
