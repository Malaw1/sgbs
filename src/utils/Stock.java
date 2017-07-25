package utils;


import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Malaw
 */
public class Stock {
    private String id;
    private Date dateStock;
    private Date dateExp;
    private String grpSanguin;
    int nbrJr;

    public Stock(String id, Date dateStock, Date dateExp, String grpSanguin) {
        this.id = id;
        this.dateStock = dateStock;
        this.dateExp = dateExp;
        this.grpSanguin = grpSanguin;

    }

    

    public String getId() {
        return id;
    }

    public Date getDateStock() {
        return dateStock;
    }

    public Date getDateExp() {
        return dateExp;
    }

    public String getGrpSanguin() {
        return grpSanguin;
    }

   

   
    public static Date addDays(Date getDateStock, int days){
        GregorianCalendar cal = new GregorianCalendar();
        cal.setTime(getDateStock);
        cal.add(Calendar.DATE, days);
        return cal.getTime();
}
    
    public static Date subtractDays(Date date, int days){
        GregorianCalendar cal = new GregorianCalendar();
        cal.setTime(date);
        cal.add(Calendar.DATE, -days);
        return cal.getTime();
    }
    
}
