package com.example.huanghuai.cleangamedemo.ui.Hall;

import android.support.annotation.NonNull;
import android.util.Log;

import com.example.huanghuai.cleangamedemo.base.BasePresenterImp;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;

/**
 * Created by huanghuai on 2019/3/28.
 */

public class HallPresenter<V extends HallContract.View> extends BasePresenterImp<V> implements HallContract.Presenter<V> {
    @Override
    public void createHall() {
        final ArrayList roomArray = new ArrayList();
        FirebaseFirestore db = FirebaseFirestore.getInstance();
        db.collection("Hall")
                .get()
                .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<QuerySnapshot> task) {
                        for (DocumentSnapshot s:task.getResult().getDocuments()){
                            roomArray.add(s.getId());
                        }
                        getView().setRecycleView(roomArray);
                    }
                });
    }
}
