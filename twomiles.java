package com.example.muhunthanravi.myapplication2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Muhunthanravi on 18/02/2017.
 */

public class twomiles extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.twomiles);

        Button costaclick = (Button) findViewById(R.id.costa);
        costaclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(twomiles.this,costa.class);
                startActivity(intent3);
            }

        });
        Button starbucksclick = (Button) findViewById(R.id.starbucks);
        starbucksclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(twomiles.this,starbucks.class);
                startActivity(intent3);
            }

        });
        Button locosclick = (Button) findViewById(R.id.locos);
       locosclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(twomiles.this,locos.class);
                startActivity(intent3);
            }

        });
        Button yardbirdclick = (Button) findViewById(R.id.yardbird);
        yardbirdclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(twomiles.this,yardbird.class);
                startActivity(intent3);
            }

        });
        Button redironclick = (Button) findViewById(R.id.Rediron);
        redironclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(twomiles.this,rediron.class);
                startActivity(intent3);
            }

        });

        Button subwayclick = (Button) findViewById(R.id.subway);
        subwayclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(twomiles.this,subway.class);
                startActivity(intent3);
            }

        });
    }
}
