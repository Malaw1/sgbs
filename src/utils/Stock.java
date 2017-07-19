/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Malaw
 */
public class Stock {
    private int num;
    private String id;
    private String dateStock;
    private String dateExp;
    private String grpSanguin;
    private int nbrJrRestant;

    public Stock(String id, String dateStock, String dateExp, String grpSanguin) {
        this.id = id;
        this.dateStock = dateStock;
        this.dateExp = dateExp;
        this.grpSanguin = grpSanguin;
    }

    public int getNum() {
        return num;
    }

    public String getId() {
        return id;
    }

    public String getDateStock() {
        return dateStock;
    }

    public String getDateExp() {
        return dateExp;
    }

    public String getGrpSanguin() {
        return grpSanguin;
    }

    public int getNbrJrRestant() {
        return nbrJrRestant;
    }

    public static Date addDays(Date date, int days){
        GregorianCalendar cal = new GregorianCalendar();
        cal.setTime(date);
        cal.add(Calendar.DATE, days);
        return cal.getTime();
    }
    
    
}
