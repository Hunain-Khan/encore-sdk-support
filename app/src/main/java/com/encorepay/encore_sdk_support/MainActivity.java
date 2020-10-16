package com.encorepay.encore_sdk_support;

import androidx.annotation.Nullable;
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
               Intent intent = new MRZScan.Builder()
                       .enableVibration(true)
                       .enableIDScan(true)
                       .enablePassportScan(true)
                       .build(MainActivity.this);
              startActivityForResult(intent,100);

            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }
}
