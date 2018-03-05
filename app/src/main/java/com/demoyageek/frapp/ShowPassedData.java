package com.demoyageek.frapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class ShowPassedData extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_passed_data);

        TextView textView = findViewById(R.id.passed_data_textView);
        Intent receivedIntent = getIntent();
        Bundle bundle = receivedIntent.getBundleExtra("bundleVal");

        textView.setText(bundle.getString("name"));

    }
}
