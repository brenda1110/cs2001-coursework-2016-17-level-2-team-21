package com.example.muhunthanravi.myapplication2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class fivemiles extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fivemiles);

        Button costaclick = (Button) findViewById(R.id.costa);
        costaclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(fivemiles.this,costa.class);
                startActivity(intent3);
            }

        });
        Button starbucksclick = (Button) findViewById(R.id.starbucks);
        starbucksclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(fivemiles.this,starbucks.class);
                startActivity(intent3);
            }

        });
        Button locosclick = (Button) findViewById(R.id.locos);
        locosclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(fivemiles.this,locos.class);
                startActivity(intent3);
            }

        });
        Button yardbirdclick = (Button) findViewById(R.id.yardbird);
        yardbirdclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(fivemiles.this,yardbird.class);
                startActivity(intent3);
            }

        });
        Button redironclick = (Button) findViewById(R.id.Rediron);
        redironclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(fivemiles.this,rediron.class);
                startActivity(intent3);
            }

        });

        Button subwayclick = (Button) findViewById(R.id.subway);
        subwayclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(fivemiles.this,subway.class);
                startActivity(intent3);
            }

        });
    }
}
