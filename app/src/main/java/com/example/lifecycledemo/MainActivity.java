package com.example.lifecycledemo;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    private static final String TAG = "ActivityLifecycle";
    private TextView lifecycleTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lifecycleTextView = findViewById(R.id.lifecycleTextView);
        updateLifecycleState("onCreate");

        Log.d(TAG, "onCreate called");
    }

    @Override
    protected void onStart() {
        super.onStart();
        updateLifecycleState("onStart");


        Log.d(TAG, "onStart called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        updateLifecycleState("onResume");


        Log.d(TAG, "onResume called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        updateLifecycleState("onPause");


        Log.d(TAG, "onPause called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        updateLifecycleState("onStop");


        Log.d(TAG, "onStop called");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        updateLifecycleState("onRestart");


        Log.d(TAG, "onRestart called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        updateLifecycleState("onDestroy");


        Log.d(TAG, "onDestroy called");
    }


    private void updateLifecycleState(String state) {
        if (lifecycleTextView != null) {
            lifecycleTextView.setText("Current state: " + state);
        }
    }
}
