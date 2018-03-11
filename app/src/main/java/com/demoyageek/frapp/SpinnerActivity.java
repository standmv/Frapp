package com.demoyageek.frapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class SpinnerActivity extends AppCompatActivity implements View.OnClickListener {
    private String[] data = {"Dog", "Cat", "Mouse"};
    private Spinner mSpinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);
        mSpinner = findViewById(R.id.spinner_one);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, data);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mSpinner.setAdapter(adapter);

        findViewById(R.id.convert_button).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Toast.makeText(this, mSpinner.getSelectedItem().toString(), Toast.LENGTH_SHORT).show();
    }
}
