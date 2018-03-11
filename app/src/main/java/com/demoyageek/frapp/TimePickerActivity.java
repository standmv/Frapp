package com.demoyageek.frapp;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TimePicker;
import android.widget.Toast;

public class TimePickerActivity extends AppCompatActivity implements View.OnClickListener {
    private TimePicker mTimePicker;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_picker);
        mTimePicker = findViewById(R.id.time_picker);
        findViewById(R.id.time_button).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
    StringBuilder sb = new StringBuilder();
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
        sb.append(mTimePicker.getHour());
    } else {
        sb.append(mTimePicker.getCurrentHour());
    }
    sb.append(":");
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
        sb.append(mTimePicker.getMinute());
    } else {
        //noinspection deprecation
        sb.append(mTimePicker.getCurrentMinute());
        }
        Toast.makeText(this, sb.toString(), Toast.LENGTH_SHORT).show();
    }
}
