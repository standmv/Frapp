package com.demoyageek.frapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class ImageButtonActivity extends AppCompatActivity implements View.OnClickListener {

    private CheckBox mMyCheckBox;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_button);
        mMyCheckBox = findViewById(R.id.my_checkbox);
        findViewById(R.id.image_button).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Toast.makeText(this, mMyCheckBox.isChecked() ? "Checked": "Not Checked", Toast.LENGTH_SHORT).show();
    }
}
