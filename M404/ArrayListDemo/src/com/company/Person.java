package com.company;

public class Person {
    String nachname;
    String vorname;
    String gebdat;
    int alter;

    // Zugriff auf Klasse Person
    public Person(String nachname, String vorname, String gebdat, int alter) {
        this.nachname = nachname;
        this.vorname = vorname;
        this.gebdat = gebdat;
        this.alter = alter;
    }
}
