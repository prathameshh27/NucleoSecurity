package com.example.spydey.prototypeone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class RecordDataActivity extends AppCompatActivity {

    public TextView identityTextView, openDateTextView, closeDateTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_record_data);

        Log.i("customLog", "RecordDataActivity -> onCreate(): exectuted");

        //Intent from Record Fragment
        Intent intent = getIntent();
        String modelStringArray[] = intent.getStringArrayExtra("modelStringArray");

        Log.i("customLog", "RecordDataActivity -> onCreate(): IntendData");
        for (String data:modelStringArray) { Log.i("customLog", "modelStringArray[]: "+data); }

        identityTextView = findViewById(R.id.identityRecordData);
        openDateTextView = findViewById(R.id.openRecordData);
        closeDateTextView = findViewById(R.id.closeRecordData);

        identityTextView.setText(modelStringArray[0]);
        openDateTextView.setText(modelStringArray[1]);
        closeDateTextView.setText(modelStringArray[2]);
    }
}
