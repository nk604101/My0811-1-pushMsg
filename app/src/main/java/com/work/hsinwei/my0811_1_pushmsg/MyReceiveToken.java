package com.work.hsinwei.my0811_1_pushmsg;

import android.util.Log;

import com.firebase.client.Firebase;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by Hsinwei on 2016/8/11.
 */
public class MyReceiveToken extends FirebaseInstanceIdService {
    @Override
    public void onTokenRefresh() {
        //super.onTokenRefresh();
        String token = FirebaseInstanceId.getInstance().getToken();
        Log.d("FCM", "Token:"+token);
    }
}
