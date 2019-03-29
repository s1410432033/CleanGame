package com.example.huanghuai.cleangamedemo.ui.LogIn;

import com.example.huanghuai.cleangamedemo.base.BasePresenter;
import com.example.huanghuai.cleangamedemo.base.BasePresenterImp;
import com.example.huanghuai.cleangamedemo.base.BaseView;

/**
 * Created by huanghuai on 2019/3/28.
 */

public interface LoginContract {
    interface View extends BaseView {
        void logBtnEvent();
        void logFail();
        void logSuccess();
        void logRegister();
    }
    interface Presenter<V extends View> extends BasePresenter<V> {
        void writeUserInDataBase(String userName,String userPassword);
    }
}
