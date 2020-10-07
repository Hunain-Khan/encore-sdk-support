package com.encorepay.encore_sdk_support;

import android.content.Context;

import com.encorepay.card_scanner.Commons;

public class OuterToastMessage {
    public static String giveMessage(Context context, String text){
       return Commons.toastMessage(context,text,"calling outer sdk from apk");
    }
}
