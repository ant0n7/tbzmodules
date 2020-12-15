package com.company;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/*
    ===============================================
    Theme:          Theme
    Author:         anton
    Date:           24/11/2020
    Project:        Uhr
    Program:        Uhr Klasse
    Description:    Uhr Programmieren Auftrag
                    im Modul 404 der TBZ
    ===============================================
*/

/*public class Uhr {
}*/





public class Uhr {
    // Eigenschaften
    private String Farbe;
    private String Form;

    // Methoden
    public String getForm(){
        return Form;

    }

    public void  setFarbe(String farbe){
        this.Farbe = farbe;
    }

// Bibliotheksfunktionen anwenden

    public void zeigeZeit()
    {
        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        Calendar cal = Calendar.getInstance();
        System.out.println(dateFormat.format(cal.getTime()));
        System.out.println("meineFarbe ist: " + Farbe);
    }

    // Konstruktor I
    public Uhr(){
        System.out.println("Konstruktor I wurde aufgerufen ");
    }

    //Konstruktor II
    public Uhr( String par){
        System.out.println(par + "Konstruktor II wurde aufgerufen " + par);
    }


} // end class


