package com.example.devauxarthur.nabegoescrazy;

/**
 * Created by devauxarthur on 16/12/2016.
 */

class StoreSingleton {
    private static StoreSingleton INSTANCE;

    private Boolean countIndice1;
    private Boolean countIndice2;
    private Boolean countIndice3;

    /** Constructeur privé */
    private StoreSingleton() {
        this.countIndice1 = false;
        this.countIndice2 = false;
        this.countIndice3 = false;

    }


    /** Point d'accès pour l'instance unique du singleton */
    public static synchronized StoreSingleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new StoreSingleton();
        }
        return INSTANCE;
    }

    public Boolean getCountIndice1() {
        return countIndice1;
    }

    public void setCountIndice1(Boolean countIndice1) {
        this.countIndice1 = countIndice1;
    }

    public Boolean getCountIndice2() {
        return countIndice2;
    }

    public void setCountIndice2(Boolean countIndice2) {
        this.countIndice2 = countIndice2;
    }

    public Boolean getCountIndice3() {
        return countIndice3;
    }

    public void setCountIndice3(Boolean countIndice3) {
        this.countIndice3 = countIndice3;
    }
}