package com.work.hsinwei.my0811_1_pushmsg;

/**
 * Created by Hsinwei on 2016/8/11.
 */
import android.util.Log;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

public class MyMessageService extends FirebaseMessagingService {
    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        //super.onMessageReceived(remoteMessage);
        Log.d("T0811-FCM","remoteMessage:"+remoteMessage.getFrom());
    }
}
