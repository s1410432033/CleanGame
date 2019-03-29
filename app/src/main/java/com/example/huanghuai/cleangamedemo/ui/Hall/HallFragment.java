package com.example.huanghuai.cleangamedemo.ui.Hall;

import android.annotation.SuppressLint;
import android.support.v4.app.FragmentTransaction;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.GridLayoutManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.huanghuai.cleangamedemo.R;
import com.example.huanghuai.cleangamedemo.base.BaseFragment;
import com.example.huanghuai.cleangamedemo.databinding.FragmentHallBinding;
import com.example.huanghuai.cleangamedemo.ui.SettingRoom.SettingDiaolog;
import com.example.huanghuai.cleangamedemo.util.Room;

import java.util.ArrayList;

/**
 * Created by huanghuai on 2019/3/28.
 */

public class HallFragment extends BaseFragment implements HallContract.View {
    private FragmentHallBinding fragmentHallBinding;
    private HallContract.Presenter presenter;
    private HallContract.View view;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        fragmentHallBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_hall,container,false);
        fragmentHallBinding.setHallView(this);
        presenter = new HallPresenter<>();
        presenter.onAttach(this);

        view = this;
        return fragmentHallBinding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        presenter.createHall();
    }

    @Override
    public void createRoomBtn() {
        FragmentTransaction fragmentTransaction = getBaseActivity().getSupportFragmentManager().beginTransaction();
        SettingDiaolog settingDiaolog = new SettingDiaolog();
        settingDiaolog.show(getBaseActivity().getSupportFragmentManager(),settingDiaolog.Tag);
    }

    @Override
    public void setRecycleView(ArrayList<Room> roomArray) {
        fragmentHallBinding.hallRecycleView.setAdapter(new HallAdapter(roomArray,view));
        fragmentHallBinding.hallRecycleView.setLayoutManager(new GridLayoutManager(getBaseActivity(),2));
    }

    @Override
    public void itemClick(View v,Room room) {
        Log.e("frag", "itemClick: "+room.getRoomName() );
        presenter.itemEvent(v,room);
    }


}
