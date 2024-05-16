package com.s22010009.mediscan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ResetPasswordActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset_password_page);
    }

    public void Resetto(View view) {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivities(new Intent[]{intent});

    }
}