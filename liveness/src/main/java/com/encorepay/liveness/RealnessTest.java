package com.encorepay.liveness;

import android.content.Context;
import android.content.Intent;

import com.encorepay.encore_libs_liveness.RealnessTestActivity;

import org.json.JSONObject;

public class RealnessTest {

    public static final String LIVENESS_DATA = "liveness_data";

    public void setRequestInfoParam(JSONObject requestInfoParam){
        RealnessTestActivity.setRequestInfoParams(requestInfoParam);
    }

    public Intent startRealnessTest(Context context){
        Intent intent = RealnessTestActivity.startRealnessActivity(context);
        return intent;
    }

}
