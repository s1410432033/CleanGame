package com.example.huanghuai.cleangamedemo.base;

/**
 * Created by huanghuai on 2018/11/21.
 */

public class BasePresenterImp<V extends BaseView> implements BasePresenter<V>{
    private V view;

    public V getView(){
        return view;
    }

    public void onAttach(V view) {
        this.view = view;
    }
}
