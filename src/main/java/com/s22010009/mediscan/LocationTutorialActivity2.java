package com.s22010009.mediscan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LocationTutorialActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_locationtutorial2);
    }

    public void backto (View view) {
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
    }

    public void gotohomepage(View view) {
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
    }


}