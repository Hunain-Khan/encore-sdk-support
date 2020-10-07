package com.encorepay.encore_sdk_support;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import io.card.payment.CardScannerActivity;


public class NextActivity extends AppCompatActivity {

    Button button,outsdkBtn;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
        outsdkBtn = findViewById(R.id.toast_btn1);
        textView = findViewById(R.id.text_view);
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
           textView.setText(OuterToastMessage.giveMessage(getApplicationContext(),"Outer Sdk message 1"));
            }
        });
    }






}
