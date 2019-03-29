package com.example.huanghuai.cleangamedemo.base;

/**
 * Created by huanghuai on 2019/3/28.
 */

public interface BasePresenter<V extends BaseView> {
    void  onAttach(V view);
}
