package com.marvedie.qualitycontroltemplate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.marvedie.qualitycontroltemplate.R;

public class Client extends AppCompatActivity {

            Button mSave;
            EditText etName;
            EditText  etMac;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_client);


        mSave = findViewById(R.id.mSave);
        etMac = findViewById(R.id.etMac);
        etName = findViewById(R.id.etName);

        mSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Client.this, MainActivity.class);
                startActivity(intent);

            }
        });


    }
}
