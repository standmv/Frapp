package com.demoyageek.frapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class EditTextActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText mEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_text);
        mEditText = findViewById(R.id.my_edit_text);
        findViewById(R.id.my_button).setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        Intent newIntent = new Intent(this, ShowPassedData.class);

        Bundle b = new Bundle();
        b.putString("name", mEditText.getText().toString());
        b.putString("surname", "Nombre");
        b.putString("stringVal", "este es el nuevo hint");

        newIntent.putExtra("bundleVal", b);
        startActivity(newIntent);
        //This method shows the text submitted in a pop up
       // Toast.makeText(this, mEditText.getText(), Toast.LENGTH_SHORT).show();
    }
}
