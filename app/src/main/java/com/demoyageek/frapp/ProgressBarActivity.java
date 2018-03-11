package com.demoyageek.frapp;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.Toast;

public class ProgressBarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress_bar);
    }

    @Override
    protected void onResume() {
        super.onResume();
        new LoadTask().execute();
    }

    class LoadTask extends AsyncTask<Void,Void,String>{

        @Override
        protected String doInBackground(Void... voids) {
            ProgressBar progressBar = findViewById(R.id.my_progress_bar_det);
            for(int i=0; i<10; i++){
                progressBar.setProgress(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            return "Termine";
        }

        @Override
        protected void onPostExecute(String aVoid) {
            super.onPostExecute(aVoid);
            Toast.makeText(ProgressBarActivity.this, aVoid, Toast.LENGTH_SHORT).show();
        }
    }
}
