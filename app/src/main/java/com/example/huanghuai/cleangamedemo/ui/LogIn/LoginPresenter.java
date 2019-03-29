package com.example.huanghuai.cleangamedemo.ui.LogIn;

import android.support.annotation.NonNull;
import android.util.Log;
import android.widget.Toast;

import com.example.huanghuai.cleangamedemo.base.BasePresenterImp;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by huanghuai on 2019/3/28.
 */

public class LoginPresenter<V extends LoginContract.View> extends BasePresenterImp<V> implements LoginContract.Presenter<V>{
    private final FirebaseFirestore db = FirebaseFirestore.getInstance();
    private Boolean isRegister = true;
    @Override
    public void writeUserInDataBase(final String userName, final String userPassword) {
        final Map map = new HashMap();
        map.put("password",userPassword);

        db.collection("User")
                .get()
                .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
            @Override
            public void onComplete(@NonNull Task<QuerySnapshot> task) {
                for(DocumentSnapshot s:task.getResult().getDocuments()) {
                    if(s.getId().equals(userName)){
                        isRegister = true;
                        if(s.get("password").toString().equals(userPassword)){
                            getView().logSuccess();
                            break;
                        }else{
                            getView().logFail();
                            break;
                        }
                    }else{
                        isRegister = false;
                    }
                }
            }
        });
            if (!isRegister){
                db.collection("User").document(userName).set(map);
                getView().logRegister();
            }
    }

}
