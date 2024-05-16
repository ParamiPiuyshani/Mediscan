package com.s22010009.mediscan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
    }

    public void back(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);  // Changed from startActivities to startActivity
    }

    public void gotoScannerpage(View view) {
        Intent intent = new Intent(this, ScannerActivity.class);
        startActivity(intent);
    }

    public void gotomedicinedatapage(View view) {
        Intent intent = new Intent(this, DatabaseActivity.class);
        startActivity(intent);
    }

    public void gotonearsthospitialpage(View view) {
        Intent intent = new Intent(this, LocationActivity.class);
        startActivity(intent);
    }

    public void gototutorialspage(View view) {
        Intent intent = new Intent(this, TutorialActivity1.class);
        startActivity(intent);
    }

    public void gotoaccountpage(View view) {
        Intent intent = new Intent(this, AccountActivety.class);
        startActivity(intent);
    }

    public void backto(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}



