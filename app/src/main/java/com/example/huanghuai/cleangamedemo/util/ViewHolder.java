package com.example.huanghuai.cleangamedemo.util;

import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;

import com.android.databinding.library.baseAdapters.BR;

/**
 * Created by huanghuai on 2019/3/29.
 */
    public class ViewHolder <B extends ViewDataBinding> extends RecyclerView.ViewHolder {
        private final B mViewDataBinding;
        public ViewHolder(B mViewDataBinding) {
            super(mViewDataBinding.getRoot());
            this.mViewDataBinding = mViewDataBinding;
        }
        public void bind(final Object object){
            mViewDataBinding.setVariable(BR.room,object);
            mViewDataBinding.executePendingBindings();
        }
    }

