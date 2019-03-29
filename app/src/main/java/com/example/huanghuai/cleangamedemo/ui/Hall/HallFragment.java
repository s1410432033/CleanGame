package com.example.huanghuai.cleangamedemo.ui.Hall;

import android.annotation.SuppressLint;
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

import java.util.ArrayList;

/**
 * Created by huanghuai on 2019/3/28.
 */

public class HallFragment extends BaseFragment implements HallContract.View {
    private FragmentHallBinding fragmentHallBinding;
    private HallContract.Presenter presenter;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        fragmentHallBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_hall,container,false);
        fragmentHallBinding.setHallView(this);
        presenter = new HallPresenter<>();
        presenter.onAttach(this);
        return fragmentHallBinding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        presenter.createHall();

    }

    @Override
    public void createRoomBtn() {
        Log.e("onclick", "createRoomBtn: " );
    }

    @Override
    public void setRecycleView(ArrayList roomNameArray) {
        fragmentHallBinding.hallRecycleView.setAdapter(new HallAdapter(roomNameArray));
        fragmentHallBinding.hallRecycleView.setLayoutManager(new GridLayoutManager(getBaseActivity(),1));
        Log.e("123", "setRecycleView: "+roomNameArray.size());
    }


}
