package com.example.huanghuai.cleangamedemo.ui.SettingRoom;

import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.huanghuai.cleangamedemo.R;

/**
 * Created by huanghuai on 2019/3/29.
 */

public class SettingDiaolog extends DialogFragment implements SettingContract.View {
    public static String Tag = SettingDiaolog.class.getSimpleName();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.diaolog_setting_room,container,false);
        return v;
    }


}
