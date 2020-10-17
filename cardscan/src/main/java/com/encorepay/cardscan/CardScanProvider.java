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

    public void setCardScanSide(Side scanSide){
        if(Side.FRONT.equals(scanSide)) {
            scanDocument.setCardScanSide(ScanSide.FRONT);
        }else if(Side.BACK.equals(scanSide)) {
            scanDocument.setCardScanSide(ScanSide.BACK);
        }else if(Side.BOTH.equals(scanSide)) {
            scanDocument.setCardScanSide(ScanSide.BOTH);
        }
    }

    public void startScanDocument(Activity activity, int REQ_CODE){
        scanDocument.startScanActivity(activity,REQ_CODE);
    }

    public void flashLightEnabled(boolean enable){
        scanDocument.flashLightEnabled(enable);
    }
}
