package com.example.test_1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class NormalActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_normal);
        Log.e("test", "onNormalActivity");
    }
    @Override
    protected void onStart() {
        super.onStart();
        // The activity is about to become visible.
        Log.e("test", "Start NormalActivity");
    }
    @Override
    protected void onResume() {
        super.onResume();
        // The activity has become visible (it is now "resumed").
        Log.e("test", "Resume NormalActivity");
    }
    @Override
    protected void onPause() {
        super.onPause();
        // Another activity is taking focus (this activity is about to be "paused").
        Log.e("test", "Pause NormalActivity");
    }
    @Override
    protected void onStop() {
        super.onStop();
        // The activity is no longer visible (it is now "stopped")
        Log.e("test", "Stop NormalActivity");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        // The activity is about to be destroyed.
        Log.e("test", "Destroy NormalActivity");
    }
}
