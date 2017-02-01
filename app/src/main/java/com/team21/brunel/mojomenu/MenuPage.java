package com.team21.brunel.mojomenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class MenuPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_page);
    }

    // List Content used to populate the list
    private List<MenuContent> createList(int size) {
        List<MenuContent> result = new ArrayList<>();

    }

}

