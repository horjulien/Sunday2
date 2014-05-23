package com.example.app;

import android.graphics.drawable.Drawable;
import android.support.v7.app.ActionBarActivity;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;


import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends ActionBarActivity {
    ListView listeItem;
    List<Item> maListe = new ArrayList<Item>();



    final String url = "http://212.83.135.90:8080/EpsiAPI/services/attractions/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listeItem = (ListView)findViewById(R.id.listActivite);

        RemplirLaListeActivite();

        ItemAdapter adapter = new ItemAdapter(this, maListe);
        listeItem.setAdapter(adapter);


    }

    private void RemplirLaListeActivite() {

        maListe.clear();

       /* maListe.add(new Activite("Restaurants",Drawable.createFromPath("restaurant")));

        maListe.add(new Activite("Cafés",Drawable.createFromPath("cafe")));

        maListe.add(new Activite("Pubs",Drawable.createFromPath("pub")));

        maListe.add(new Activite("Musées", Drawable.createFromPath("musee")));*/
    }



        @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);


    }


    public void chargerData() {


        RequestQueue queue = Volley.newRequestQueue(this);
        final ListView reponse = (ListView) findViewById(R.id.listActivite);
        JsonObjectRequest jsObjRequest = new JsonObjectRequest(Request.Method.GET, url, null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        //reponse.setText(response.toString()); // We set the response data in the TextView
                        Log.w("Main", "on passe dans onResponse");
                    }
                }, new Response.ErrorListener() {

            @Override
            public void onErrorResponse(VolleyError error) {
                System.out.println("Fuck [" + error + "]");
            }

        }
        );
        queue.add(jsObjRequest);
    }





}
