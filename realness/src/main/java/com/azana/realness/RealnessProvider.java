package com.azana.realness;

import android.content.Context;
import android.content.Intent;

import com.encorepay.encore_libs_liveness.RealnessTestActivity;

import org.json.JSONObject;

public class RealnessProvider {

    public static final String LIVENESS_DATA = "liveness_data";

    public static void setRequestInfoParam(JSONObject requestInfoParam){
        RealnessTestActivity.setRequestInfoParams(requestInfoParam);
    }

    public static Intent startRealnessTest(Context context){
        Intent intent = RealnessTestActivity.startRealnessActivity(context);
        return intent;
    }

}
