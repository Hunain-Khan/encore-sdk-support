package com.encorepay.encore_sdk_support;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Base64;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.encorepay.MRZ.MRZScan;
import com.encorepay.cardscan.CardScanProvider;

import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    String cardImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.front_id_scan_btn);
        Button livenssBtn = findViewById(R.id.liveness_btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        });

        livenssBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                JSONObject livnessFace = new JSONObject();
                JSONObject livenessRequestInfo = new JSONObject();
                try {
                    livnessFace.put("selfieCapture", "Y");
                    livnessFace.put("faceMatch", "Y");
                    livnessFace.put("licenseKey", "34858E56FXE56XYR");
                    livnessFace.put("imageID", cardImage);
                    livenessRequestInfo.put("requestInfo", livnessFace);

                } catch (Exception ex) {

                }
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == 200){
            if(resultCode == RESULT_OK) {

            }
        }
    }
}
