package com.developer.taskify;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class WelcomeBack_1 extends AppCompatActivity {
   private ImageView mbtnplus_1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_back1);
        mbtnplus_1 = findViewById(R.id.mbtnplus_1);
        mbtnplus_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WelcomeBack_1.this, Profile.class);
                startActivity(intent);
            }
        });
    }
}