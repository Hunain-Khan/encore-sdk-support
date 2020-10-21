package com.encorepay.encore_sdk_support;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.encorepay.MRZ.MRZScan;
import com.encorepay.commons.models.ScanSide;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = findViewById(R.id.front_id_scan_btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//               Intent intent = new MRZScan.Builder()
//                      .setRequestInfoParams(R)
//                       .build(this);
//              startActivityForResult(intent,100);

            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == 100){
            if(resultCode == RESULT_OK){
//               KycFields kyc = (KycFields) data.getExtras().getParcelable(MRZScan.KYC_DATA);
//                Toast.makeText(this,kyc.getName(),Toast.LENGTH_SHORT).show();
            }
        }
    }
}
