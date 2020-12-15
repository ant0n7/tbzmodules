package com.company;
import java.util.Scanner;
import java.util.Timer;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;
import java.text.DateFormat;
import java.text.ParseException;

/*
 *  ===============================================
 *  Theme:          Theme
 *  Author:         anton
 *  Date:
 *  Project:
 *  Program:        First Program
 *  Description:    Hello World
 *  ===============================================
 */

public class Wecker {
    int zeit;
    String alarm;
    boolean cont = true;
    public Wecker() {

    }

    public void displayTime() {
        SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss z");
        Date date = new Date(System.currentTimeMillis());
        System.out.println(formatter.format(date));
        System.out.flush();
    }

    public String getTime() {
        SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss z");
        Date date = new Date(System.currentTimeMillis());
        return formatter.format(date);
    }

    public void setAlarm() {
        Scanner input = new Scanner(System.in);
        String alarm = input.nextLine();
        //SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss z");
        //this.alarm = formatter.format(alarm);
        this.alarm = alarm;
    }
    //Scanner scanner = new Scanner();
}
