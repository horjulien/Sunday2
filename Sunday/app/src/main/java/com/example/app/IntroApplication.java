package com.example.app;

import android.app.Application;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

/**
 * Created by Hor on 25/04/14.
 */
public class IntroApplication extends Application {

    private static final String NOM = "aux-deux-fondues-montpellier";
    final String url = "http://212.83.135.90:8080/EpsiAPI/services/attractions/";



    RequestQueue volleyRequestQueue;


    @Override
    public void onCreate() {
        super.onCreate();
        volleyRequestQueue = Volley.newRequestQueue(this);
        volleyRequestQueue.start();
    }



    @Override
    public void onTerminate() {
        volleyRequestQueue.stop();
        super.onTerminate();
    }

    public RequestQueue getVolleyRequestQueue() {
        return volleyRequestQueue;
    }

}
