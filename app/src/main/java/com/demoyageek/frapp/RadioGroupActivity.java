package com.demoyageek.frapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class RadioGroupActivity extends AppCompatActivity implements View.OnClickListener {
    private RadioGroup mRadioGroup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_group);
        mRadioGroup = findViewById(R.id.my_radio_group);
        findViewById(R.id.radio_group_button).setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        RadioButton selected = findViewById(mRadioGroup.getCheckedRadioButtonId());
        if (selected != null){
            Toast.makeText(this, "Selected: " + selected.getText(), Toast.LENGTH_SHORT).show();
        }

    }
}
