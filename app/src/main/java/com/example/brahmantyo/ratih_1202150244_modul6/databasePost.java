package com.example.brahmantyo.ratih_1202150244_modul6;

import com.google.firebase.database.IgnoreExtraProperties;

@IgnoreExtraProperties
public class databasePost {
    String image, judul, caption, user, key; //inisiasi objek

    public databasePost(){

    }
    public databasePost(String caption, String image, String judul, String user ){
        this.image = image; //mendeklarasikan objek
        this.judul = judul;
        this.caption = caption;
        this.user = user;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getImage() {
        return image;
    }

    public String getJudul() {
        return judul;
    }

    public String getCaption() {
        return caption;
    }

    public String getUser() {
        return user;
    }

    public String getKey() {
        return key;
    }
}
