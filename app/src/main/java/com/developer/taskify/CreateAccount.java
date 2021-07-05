package com.developer.taskify;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CreateAccount extends AppCompatActivity {
  private TextView mbtnCreate_1;
  private TextView mbtnForgot;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);
        mbtnCreate_1 = findViewById(R.id.mbtnCreate_1);
        mbtnForgot = findViewById(R.id.mbtnForgot);
        mbtnCreate_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CreateAccount.this, Login.class);
                startActivity(intent);
            }
        });
        Intent intent = new Intent(CreateAccount.this, Login.class);
        startActivity(intent);
    }
}