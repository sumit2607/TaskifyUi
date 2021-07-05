package com.developer.taskify;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class WelcomeBack extends AppCompatActivity {
 private ImageView mbtnplus;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_back);
        mbtnplus = findViewById(R.id.mbtnplus);
        mbtnplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WelcomeBack.this, WelcomeBack_1.class);
                startActivity(intent);
            }
        });
    }
}