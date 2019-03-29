package com.example.huanghuai.cleangamedemo.ui.SettingRoom;

import com.example.huanghuai.cleangamedemo.base.BasePresenter;
import com.example.huanghuai.cleangamedemo.base.BaseView;
import com.example.huanghuai.cleangamedemo.ui.LogIn.LoginContract;

/**
 * Created by huanghuai on 2019/3/29.
 */

public interface SettingContract {
    interface View extends BaseView {

    }
    interface Presenter<V extends SettingContract.View> extends BasePresenter<V> {
    }
}
