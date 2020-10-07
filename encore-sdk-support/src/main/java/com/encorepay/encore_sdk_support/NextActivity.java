package com.encorepay.encore_sdk_support;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.encorepay.card_scanner.CardScannerActivity;
import com.encorepay.card_scanner.Commons;

public class NextActivity extends AppCompatActivity {

    Button button,outsdkBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
        outsdkBtn = findViewById(R.id.toast_btn1);
        button = findViewById(R.id.next_btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(NextActivity.this, CardScannerActivity.class);
                startActivity(intent);
            }
        });

        outsdkBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Commons.toastMessage(getApplicationContext(),"Outer Sdk message 1");
            }
        });
    }






}
