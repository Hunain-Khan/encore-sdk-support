package com.encorepay.cardscan;
import android.app.Activity;

import com.encorepay.card_scanner.ScanDocument;
import com.encorepay.card_scanner.ScanSide;

public class CardScanProvider {
   private ScanDocument scanDocument;
   public static final String CARD_FRONT_IMAGE = "cardFrontSideImage";
   public static final String CARD_BACK_IMAGE = "cardBackSideImage";

    public CardScanProvider(){
        scanDocument = new ScanDocument();
    }

    public void setCardScanSide(String Side){
        if(ScanSide.FRONT.equals(Side)) {
            scanDocument.setCardScanSide(ScanSide.FRONT);
        }else if(ScanSide.BACK.equals(Side)) {
            scanDocument.setCardScanSide(ScanSide.BACK);
        }else if(ScanSide.BOTH.equals(Side)) {
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
