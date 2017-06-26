package com.example.mladen.xwsclient.database;


import java.util.List;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class SpisakProizvoda extends RealmObject{

//    @PrimaryKey
//    private int id;
    private int cena;
    private String naziv;

    public SpisakProizvoda() {}

//    //public int getId() {
//        return id;
//    }

//    public void setId(int id) {
//        this.id = id;
//    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }
}
