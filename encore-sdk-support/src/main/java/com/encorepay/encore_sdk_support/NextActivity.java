package com.encorepay.encore_sdk_support;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.encorepay.card_scanner.CardScannerActivity;

public class NextActivity extends AppCompatActivity {

    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
        button = findViewById(R.id.next_btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(NextActivity.this, CardScannerActivity.class);
                startActivity(intent);
            }
        });
    }


    public void toastMessage(){
        Toast.makeText(this,"this message is from dependent sdk",Toast.LENGTH_SHORT).show();
    }
}
