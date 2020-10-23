package com.azana.cardscan;

import android.content.Context;
import android.content.Intent;
import com.encorepay.card_scanner.ScanDocumentActivity;


import org.json.JSONObject;

public class CardScanProvider {
    public static String CARD_SCAN_DATA = "cardScanningData";

    public static void setRequestInfoParam(JSONObject requestInfoParam){
        ScanDocumentActivity.setRequestInfoParam(requestInfoParam);
    }

    public static Intent startScanActivity(Context context){
      Intent intent = ScanDocumentActivity.startScanDocument(context);
      return intent;
    }
}
