package com.example.huanghuai.cleangamedemo.ui.SettingRoom;

import android.support.annotation.NonNull;
import android.util.Log;
import android.widget.EditText;
import android.widget.Spinner;

import com.example.huanghuai.cleangamedemo.base.BasePresenterImp;
import com.example.huanghuai.cleangamedemo.util.Room;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreSettings;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by huanghuai on 2019/3/29.
 */

public class SettingPresenter<V extends SettingContract.View> extends BasePresenterImp<V> implements SettingContract.Presenter<V> {
    private Room room = new Room();
    private final FirebaseFirestore db = FirebaseFirestore.getInstance();


    @Override
    public void createRoom() {

//        Log.e("TAG", "createRoom: " +"hjhjjfjgg");
        Map<String, Integer> test = new HashMap<>();
        test.put("numberOfTeam", room.getNumberOfTeam());
        test.put("numberOfTeamMember", room.getNumberOfTeamMember());
        db.collection("Hall")
                .document(room.getRoomName())
                .set(test)
                .addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        if (task.isSuccessful()) {
                            Log.e("TAG", "Success " + "sdasd");
                        } else {
                            Log.e("TAG", "Fail " + "ppppp");
                        }
                    }
                });


//                .add(test)
//                .addOnCompleteListener(new OnCompleteListener<DocumentReference>() {
//                    @Override
//                    public void onComplete(@NonNull Task<DocumentReference> task) {
//                        if (task.isSuccessful()){
//                            Log.e("TAG", "Success " + "dasdasd");
//
//                        }else{
//                            Log.e("TAG", "Error " +"asdasd" );
//                        }
//                    }
//                });


    }

    @Override
    public void setRoomWidget(EditText tName, Spinner teamAmount, Spinner memberAmount) {
        room.setRoomName(tName.getText().toString());
        room.setNumberOfTeam(((int) teamAmount.getSelectedItemId()) + 1);
        room.setNumberOfTeamMember(((int) memberAmount.getSelectedItemId() + 1));

    }

    @Override
    public void roomInfo() {
        Map<String, String> test = new HashMap<>();
        test.put("Member", "");
        Log.e("TAG", "roomInfo " + "aaaaaaaa");
        for (int i = 1; i <= room.getNumberOfTeam(); i++) {


//            db.collection("Aaa").document("aaa");
            db.collection(room.getRoomName())
                    .document("Team" + i)
                    .set(test)
                    .addOnCompleteListener(new OnCompleteListener<Void>() {
                        @Override
                        public void onComplete(@NonNull Task<Void> task) {

                        }
                    });

        }

    }

//    @Override
//    public int toDouble(int input) {
//        return input * 2;
//    }
}
