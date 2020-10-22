package com.encorepay.cardscan;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.encorepay.card_scanner.ScanDocumentActivity;


import org.json.JSONObject;

public class CardScanProvider {
  private
   public static final String CARD_FRONT_IMAGE = "cardFrontSideImage";
   public static final String CARD_BACK_IMAGE = "cardBackSideImage";



    public void setRequestInfoParam(JSONObject requestInfoParam){
        ScanDocumentActivity.setRequestInfoParam(requestInfoParam);
    }

    public Intent startScanActivity(Context context){
      Intent intent = ScanDocumentActivity.startScanDocument(context);
      return intent;
    }
}
