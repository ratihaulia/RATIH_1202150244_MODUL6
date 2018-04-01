package com.example.brahmantyo.ratih_1202150244_modul6;

import com.google.firebase.database.IgnoreExtraProperties;

/**
 * Created by telkom on 31/03/2018.
 */

@IgnoreExtraProperties
public class databaseKomen {
    String sikomen, komen, fotokomen; //inisiasi objek

    public databaseKomen(){

    }
    public databaseKomen(String sikomen, String komen, String fotokomen){
        this.sikomen = sikomen; //mendeklarasikan objek
        this.komen = komen;
        this.fotokomen = fotokomen;
    }

    public String getSikomen() {
        return sikomen;
    }

    public String getKomen() {
        return komen;
    }

    public String getFotokomen() {
        return fotokomen;
    }
}
