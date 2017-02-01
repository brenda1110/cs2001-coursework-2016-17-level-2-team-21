package com.team21.brunel.mojomenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MenuPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_page);
    }

    // List Content used to populate the list
    private List<MenuContent> createList(int size) {
        List<MenuContent> result = new ArrayList<>();
        List<String> titles = new ArrayList<>();
        titles.add(getString(R.string.card_title_1));
        // Add more titles if and when needed

        List<String> desc = new ArrayList<>();
        desc.add(getString(R.string.card_description_1));

        for (int i = 0; i < size; i++) {
            MenuContent mc = new MenuContent();
            mc.screenName = titles.get(i);
            mc.screenDesc = desc.get(i);

            result.add(mc);
        }
        return result;
    }

}

