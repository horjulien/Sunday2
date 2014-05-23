package com.example.app;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Hor on 09/05/14.
 */
public class MainAttraction extends Activity {

    ListView listeAttractions;
    List<Activite> maListe = new ArrayList<Activite>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.liste_attractions);

        listeAttractions = (ListView)findViewById(R.id.listAttractions);

        RemplirLaListeActivite();

        AttractionAdapter adapter = new AttractionAdapter(this, maListe);
        listeAttractions.setAdapter(adapter);


    }

    private void RemplirLaListeActivite() {

        maListe.clear();

        maListe.add(new Activite("Restaurants", Drawable.createFromPath("restaurant")));

        maListe.add(new Activite("Cafés",Drawable.createFromPath("cafe")));

        maListe.add(new Activite("Pubs",Drawable.createFromPath("pub")));

        maListe.add(new Activite("Musées", Drawable.createFromPath("musee")));
    }

}
