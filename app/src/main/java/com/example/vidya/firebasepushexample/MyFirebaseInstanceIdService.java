package com.example.vidya.firebasepushexample;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by Vidya on 3/29/2018.
 */

public class MyFirebaseInstanceIdService extends FirebaseInstanceIdService {
    //this method will be called
    //when the token is generated
    @Override
    public void onTokenRefresh() {
        super.onTokenRefresh();

        //now we will have the token
        String token = FirebaseInstanceId.getInstance().getToken();
        Log.d("MyRefreshedToken", token);

    }
}

