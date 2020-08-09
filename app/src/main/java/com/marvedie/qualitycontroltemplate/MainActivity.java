package com.marvedie.qualitycontroltemplate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button mSpiritlevel;
    Button mIndoorOTU;
    Button mPing;
    Button mSpeed;
    Button mLightbeam;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSpiritlevel = findViewById(R.id.mSpiritLevel);
        mIndoorOTU = findViewById(R.id.mIndoorOtu);
        mPing = findViewById(R.id.mPing);
        mSpeed = findViewById(R.id.mSpeed);
        mLightbeam = findViewById(R.id.mLightBeam);



        mSpiritlevel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Uploadfile.class);
                startActivity(intent);
            }
        });
        mSpeed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Uploadfile.class);
                startActivity(intent);
            }
        });
        mLightbeam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Uploadfile.class);
                startActivity(intent);
            }
        });
        mIndoorOTU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Uploadfile.class);
                startActivity(intent);
            }
        });

    }


}
