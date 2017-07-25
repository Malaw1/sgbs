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
public class Donneur {
  
    private String idDonneur, nomDonneur, prenomDonneur, adresse, lieuNaiss, genre, login, password, dateNaiss , cin, numTel, nomGroupe;
    private int taille, poids, idGroupe;

    public Donneur(String idDonneur, String nomDonneur, String prenomDonneur, String adresse, String lieuNaiss, String genre, String login, String password, String dateNaiss, String cin, String numTel, int taille, int poids, int idGroupe, String nomGroupe) {
        this.idDonneur = idDonneur;
        this.nomDonneur = nomDonneur;
        this.prenomDonneur = prenomDonneur;
        this.adresse = adresse;
        this.lieuNaiss = lieuNaiss;
        this.genre = genre;
        this.login = login;
        this.password = password;
        this.dateNaiss = dateNaiss;
        this.cin = cin;
        this.numTel = numTel;
        this.taille = taille;
        this.poids = poids;
        this.idGroupe = idGroupe;
        this.nomGroupe = nomGroupe;
    }

    public String getNomGroupe() {
        return nomGroupe;
    }

    public String getIdDonneur() {
        return idDonneur;
    }

    public String getNomDonneur() {
        return nomDonneur;
    }

    public String getPrenomDonneur() {
        return prenomDonneur;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getLieuNaiss() {
        return lieuNaiss;
    }

    public String getGenre() {
        return genre;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getDateNaiss() {
        return dateNaiss;
    }

    public String getCin() {
        return cin;
    }

    public String getNumTel() {
        return numTel;
    }

    public int getTaille() {
        return taille;
    }

    public int getPoids() {
        return poids;
    }

    public int getIdGroupe() {
        return idGroupe;
    }
    
}
