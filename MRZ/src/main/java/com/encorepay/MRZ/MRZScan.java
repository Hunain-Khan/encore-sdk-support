package com.encorepay.MRZ;



import android.content.Context;
import android.content.Intent;

import com.encorepay.encore_libs_mrz_scanner.Scanner.MRZ;

public class MRZScan {
    public static final String KYC_DATA  = "KycData";
    public static class Builder {
        private MRZ.Builder mrz;

        public Builder() {
            mrz = new MRZ.Builder();
        }

        public MRZScan.Builder enableIDScan(boolean enableIDScan){
            mrz.setAllowIDScan(enableIDScan);
            return this;
        }

        public MRZScan.Builder enablePassportScan(boolean enablePassportScan){
            mrz.setAllowPassportScan(enablePassportScan);
            return this;
        }

        public MRZScan.Builder enableVisaScan(boolean enableVisaScan){
            mrz.setAllowVisaScan(enableVisaScan);
            return this;
        }

        public MRZScan.Builder validateCountryCode(boolean validateCountryCode){
            mrz.isCountryValidateEnable(validateCountryCode);
            return this;
        }

        public MRZScan.Builder warnIncapatibleCamera(boolean enabled){
            mrz.warnIncompatibleCamera(enabled);
            return this;
        }

        public MRZScan.Builder continuousScanEnabled(boolean continuousScanEnabled){
            mrz.continuousScan(continuousScanEnabled);
            return this;
        }

        public MRZScan.Builder enableVibration(boolean enabled){
            mrz.enableViration(enabled);
            return this;
        }

        public MRZScan.Builder enableScanFromGallery(boolean enabled){
            mrz.setScanFromGallery(enabled);
            return this;
        }

        public Intent build(Context context){
           return mrz.build(context);
        }


    }
}

