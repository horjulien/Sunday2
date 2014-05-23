package com.example.app;

import android.graphics.drawable.Drawable;

/**
 * Created by Hor on 22/04/14.
 */
public class Activite {

    private String nom;
    private Drawable img;

    public Drawable getImg() {
        return img;
    }

    public void setImg(Drawable img) {
        this.img = img;
    }


    public Activite(String activite, Drawable image) {
        this.nom = activite;
        this.img = image;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }


}
