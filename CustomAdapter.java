package com.example.muhunthanravi.myapplication2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Muhunthanravi on 08/03/2017.
 */

public class CustomAdapter extends ArrayAdapter<User> {

    public CustomAdapter(Context context, ArrayList<User> users) {
        super(context,0, users);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        User user =getItem(position);

        if (convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_user,parent,false);
        }

        TextView leftTextView = (TextView) convertView.findViewById(R.id.left_side);
        TextView rightTextView = (TextView) convertView.findViewById(R.id.right_side);

        leftTextView.setText(user.name);
        rightTextView.setText(user.hometown);

        return convertView;
    }
}
