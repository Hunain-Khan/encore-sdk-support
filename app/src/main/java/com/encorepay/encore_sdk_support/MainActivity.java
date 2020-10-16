package com.encorepay.encore_sdk_support;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.encorepay.MRZ.MRZScan;
import com.encorepay.cardscan.CardScanProvider;
import com.encorepay.cardscan.Side;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = findViewById(R.id.front_id_scan_btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CardScanProvider s = new CardScanProvider();
                s.setCardScanSide(Side.FRONT);
                s.startScanDocument(MainActivity.this,100);

            }
        });

    }
}
