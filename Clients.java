package com.example.muhunthanravi.myapplication2;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;


import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

public class Clients extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clients);

        Button starbucksclick = (Button) findViewById(R.id.st);
        starbucksclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(Clients.this,starbucks.class);
                startActivity(intent2);
            }

        });


        Button costaclick = (Button) findViewById(R.id.costa);
        costaclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(Clients.this,costa.class);
                startActivity(intent3);
            }

        });
        Button Locosclick = (Button) findViewById(R.id.locos);
        Locosclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(Clients.this,locos.class);
                startActivity(intent1);
            }

        });

        Button subwayclick = (Button) findViewById(R.id.subway);
        subwayclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent(Clients.this,subway.class);
                startActivity(intent4);
            }

        });
    }
}
