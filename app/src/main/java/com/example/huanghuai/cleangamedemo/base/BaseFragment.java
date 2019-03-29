package com.example.huanghuai.cleangamedemo.base;

import android.content.Context;
import android.support.v4.app.Fragment;


/**
 * Created by huanghuai on 2018/11/22.
 */

public class BaseFragment extends Fragment{
    BaseActivity baseActivity;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        baseActivity = (BaseActivity)context;
    }

    public BaseActivity getBaseActivity(){
        return baseActivity;
    }
}
