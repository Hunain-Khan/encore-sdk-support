package com.azana.MRZ;
import android.content.Context;
import android.content.Intent;

import com.encorepay.encore_libs_mrz_scanner.Scanner.MRZ;

import org.json.JSONObject;

public class MRZScanProvider {

    public static final String KYC_DATA  = "KycData";

    public static class Builder {

        private MRZ.Builder mrz;

        public Builder() {
            mrz = new MRZ.Builder();
        }

        public MRZScanProvider.Builder setRequestInfoParams(JSONObject requestInfoParams){
            mrz.setRequestInfoParams(requestInfoParams);
            return this;
        }

        public Intent build(Context context){
           return mrz.build(context);
        }


    }
}

