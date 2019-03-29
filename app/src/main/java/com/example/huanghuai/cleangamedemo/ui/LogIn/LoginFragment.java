package com.example.huanghuai.cleangamedemo.ui.LogIn;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.Toast;

import com.example.huanghuai.cleangamedemo.R;
import com.example.huanghuai.cleangamedemo.base.BaseFragment;
import com.example.huanghuai.cleangamedemo.databinding.FragmentLoginBinding;
import com.example.huanghuai.cleangamedemo.ui.Hall.HallFragment;


/**
 * Created by huanghuai on 2019/3/28.
 */

public class LoginFragment extends BaseFragment implements LoginContract.View{

    private FragmentLoginBinding fragmentLoginBinding;
    private LoginContract.Presenter<LoginContract.View> presenter;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        fragmentLoginBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_login,container,false);
        fragmentLoginBinding.setContract(this);
        presenter = new LoginPresenter();
        presenter.onAttach(this);

        return fragmentLoginBinding.getRoot();
    }

    @Override
    public void logBtnEvent() {
        presenter.writeUserInDataBase(fragmentLoginBinding.userName.getText().toString(),fragmentLoginBinding.userPassword.getText().toString());
    }

    @Override
    public void logFail() {
        Toast.makeText(getBaseActivity(),"密碼錯誤", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void logSuccess() {
        Toast.makeText(getBaseActivity(),"登入成功", Toast.LENGTH_SHORT).show();
        FragmentTransaction fragmentTransaction = getBaseActivity().getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.main,new HallFragment()).commit();
    }

    @Override
    public void logRegister() {
        Toast.makeText(getBaseActivity(),"註冊成功，請再登入一次", Toast.LENGTH_SHORT).show();
    }
}
