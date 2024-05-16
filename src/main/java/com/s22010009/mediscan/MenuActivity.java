package com.s22010009.mediscan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menupage);
    }
    public void gotoreportpage(View view) {
        Intent intent = new Intent(this, ReportActivity.class);
        startActivity(intent);
    }
    public void gotofeedbackpage(View view) {
        Intent intent = new Intent(this, FeedbackActivity.class);
        startActivity(intent);
    }
    public void  backinto (View view) {
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);

    }


}