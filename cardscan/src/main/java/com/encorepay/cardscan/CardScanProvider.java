package com.encorepay.cardscan;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.encorepay.card_scanner.ScanDocumentActivity;


import org.json.JSONObject;

public class CardScanProvider {
    public static String CARD_SCAN_DATA = "cardScanningData";

    public void setRequestInfoParam(JSONObject requestInfoParam){
        ScanDocumentActivity.setRequestInfoParam(requestInfoParam);
    }

    public Intent startScanActivity(Context context){
      Intent intent = ScanDocumentActivity.startScanDocument(context);
      return intent;
    }
}
