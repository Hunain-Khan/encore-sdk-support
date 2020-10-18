package com.encorepay.cardscan;
import android.app.Activity;

import com.encorepay.card_scanner.ScanDocument;
import com.encorepay.commons.models.ScanSide;


public class CardScanProvider {
   private ScanDocument scanDocument;
   public static final String CARD_FRONT_IMAGE = "cardFrontSideImage";
   public static final String CARD_BACK_IMAGE = "cardBackSideImage";

    public CardScanProvider(){
        scanDocument = new ScanDocument();
    }

    public void setCardScanSide(ScanSide scanSide){
        scanDocument.setCardScanSide(scanSide);
    }

    public void startScanDocument(Activity activity, int REQ_CODE){
        scanDocument.startScanActivity(activity,REQ_CODE);
    }

    public void flashLightEnabled(boolean enable){
        scanDocument.flashLightEnabled(enable);
    }
}
