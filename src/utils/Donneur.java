/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.text.SimpleDateFormat;
import java.util.Date;


/**
 *
 * @author Malaw
 */
public class Donneur {

    private String idDonneur, nomDonneur, prenomDonneur, adresse, lieuNaiss, genre, login, password, dateNaiss;
    private int taille, poids, cin, numTel, idGroupe;
    

    public Donneur(String idDonneur, String nomDonneur, String prenomDonneur, int idGroupe, String adresse, String dateNaiss, String lieuNaiss, int taille, int poids, String genre ,  int numTel, int cin, String login, String password) {
        this.idDonneur = idDonneur;
        this.nomDonneur = nomDonneur;
        this.prenomDonneur = prenomDonneur;
        this.adresse = adresse;
        this.dateNaiss = dateNaiss;
        this.lieuNaiss = lieuNaiss;
        this.genre = genre;
        this.login = login;
        this.password = password;
        this.taille = taille;
        this.poids = poids;
        this.cin = cin;
        this.numTel = numTel;
        this.idGroupe = idGroupe;
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

    public String getDateNaiss() {
        return dateNaiss;
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

    public int getTaille() {
        return taille;
    }

    public int getPoids() {
        return poids;
    }

    public int getCin() {
        return cin;
    }

    public int getNumTel() {
        return numTel;
    }
    
    public int getIdGroupe() {
        return idGroupe;
    }
    
    
}
