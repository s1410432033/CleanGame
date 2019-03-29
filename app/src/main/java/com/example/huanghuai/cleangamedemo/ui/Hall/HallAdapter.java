package com.example.huanghuai.cleangamedemo.ui.Hall;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.huanghuai.cleangamedemo.databinding.HallItemBinding;
import com.example.huanghuai.cleangamedemo.util.Room;
import com.example.huanghuai.cleangamedemo.util.ViewHolder;

import java.util.ArrayList;

/**
 * Created by huanghuai on 2019/3/28.
 */

public class HallAdapter extends RecyclerView.Adapter<ViewHolder<HallItemBinding>> implements Adpater {
    private ArrayList<Room> roomArray;
    private HallItemBinding hallItemBinding;
    private HallContract.View view;
    public HallAdapter(ArrayList<Room> roomArray,HallContract.View view){
        this.roomArray = new ArrayList<Room>();
        this.roomArray = roomArray;
        this.view = view;
    }
    @NonNull
    @Override
    public ViewHolder<HallItemBinding> onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        hallItemBinding = HallItemBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        hallItemBinding.setItem(this);
        return new ViewHolder<>(hallItemBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder<HallItemBinding> holder, int position) {
        hallItemBinding.roomName.setText(roomArray.get(position).getRoomName());
        holder.bind(roomArray.get(position));
    }

    @Override
    public int getItemCount() {
        return roomArray.size();
    }

    @Override
    public void onclick(View v,Room room) {
        view.itemClick(v,room);
    }
}
