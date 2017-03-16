package com.example.muhunthanravi.myapplication2;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

/**
 * Created by Muhunthanravi on 09/03/2017.
 */

public class costa extends AppCompatActivity {

    String json_url = "http://192.168.0.22/costa.php";
    ListView listView;
    ArrayList<User> users;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_costa);
        users = new ArrayList<>();
        listView = (ListView) findViewById(R.id.list);

        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(Request.Method.GET,json_url,(String)null,
                new Response.Listener<JSONArray>(){
                    @Override
                    public void onResponse(JSONArray response) {
                        new costa.backgroundTask().execute(response);
                    }
                },new Response.ErrorListener(){



            @Override
            public void onErrorResponse(VolleyError error) {
                // Toast.makeText(context,"Error.....",Toast.LENGTH_SHORT).show();
                error.printStackTrace();

            }

        }
        );
        MySingleton.getInstance(this).addToRequestque(jsonArrayRequest);
    }

    class backgroundTask extends AsyncTask<JSONArray,Void,ArrayList<User>> {
        @Override
        protected ArrayList<User> doInBackground(JSONArray... params) {

            int count= 0;
            while(count<params[0].length()){
                try {
                    JSONObject jsonObject = params[0].getJSONObject(count);
                    User contact = new User(jsonObject.getString("Menuname"));
                   // User contact = new User(jsonObject.getString("Menuname"),jsonObject.getString("price"));
                    users.add(contact);
                    count++;


                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }

            return users;
        }

        @Override
        protected void onPostExecute(ArrayList<User> users) {
            CustomAdapter customAdaptor = new CustomAdapter(costa.this, users);

            listView.setAdapter(customAdaptor);
        }
    }
}

