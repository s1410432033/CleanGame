package com.example.huanghuai.cleangamedemo.ui.SettingRoom;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.huanghuai.cleangamedemo.R;
import com.example.huanghuai.cleangamedemo.databinding.DiaologSettingRoomBinding;

/**
 * Created by huanghuai on 2019/3/29.
 */

public class SettingDiaolog extends DialogFragment implements SettingContract.View {
    public static String Tag = SettingDiaolog.class.getSimpleName();
    private SettingContract.Presenter<SettingContract.View> presenter;
    DiaologSettingRoomBinding diaologSettingRoomBinding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        diaologSettingRoomBinding = DataBindingUtil.inflate(inflater, R.layout.diaolog_setting_room, container, false);
        diaologSettingRoomBinding.setRoomView(this);
        presenter = new SettingPresenter<>();
        presenter.onAttach(this);

//        View v = inflater.inflate(R.layout.diaolog_setting_room,container,false);
//        return v;
        return diaologSettingRoomBinding.getRoot();
    }


    @Override
    public void setRoom() {
        Log.e("TAG", "testtest " +"asdasd" );
//        String tName = diaologSettingRoomBinding.editText.getEditText().getText().toString();
//        int teamAmount = ((int)diaologSettingRoomBinding.team.getSelectedItemId()) + 1;
//        int memberAmount = ((int)diaologSettingRoomBinding.member.getSelectedItemId()) + 1;
        presenter.setRoomWidget(diaologSettingRoomBinding.editText.getEditText(), diaologSettingRoomBinding.team, diaologSettingRoomBinding.member);
        presenter.createRoom();
        presenter.roomInfo();
        SettingDiaolog.this.dismiss();
//        int output = presenter.toDouble(2);


    }
}
