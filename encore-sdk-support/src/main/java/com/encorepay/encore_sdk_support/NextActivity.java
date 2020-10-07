package com.encorepay.encore_sdk_support;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.encorepay.card_scanner.CardScannerActivity;

public class NextActivity extends AppCompatActivity {

    Button button,innerSdk1,innerSdk2,innerSdk3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
        button = findViewById(R.id.next_btn);
        innerSdk1 = findViewById(R.id.toast_btn1);
        innerSdk2 = findViewById(R.id.toast_btn2);
        innerSdk3 = findViewById(R.id.toast_btn3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(NextActivity.this, CardScannerActivity.class);
                startActivity(intent);
            }
        });


        innerSdk1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               toastMessage("Inner Sdk Toast message for button 1");
            }
        });

        innerSdk2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toastMessage("Inner Sdk Toast message for button 2");
            }
        });
        innerSdk3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toastMessage("Inner Sdk Toast message for button 3");
            }
        });
    }

    public void toastMessage(String message){
        Toast.makeText(this,message,Toast.LENGTH_SHORT).show();
    }





}
