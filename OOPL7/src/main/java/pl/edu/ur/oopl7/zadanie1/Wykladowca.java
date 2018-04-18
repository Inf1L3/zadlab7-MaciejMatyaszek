/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl7.zadanie1;

/**
 *
 * @author student
 */

    
public class Wykladowca extends Osoba  {

    String przedmiot;
    int stazpracy;
    String tytulnaukowy;

    public Wykladowca(String przedmiot, int stazpracy, String tytulnaukowy, String imie, String nazwisko, String dataUrodzenia, String płeć) {
        super(imie, nazwisko, dataUrodzenia, płeć);
        this.przedmiot = przedmiot;
        this.stazpracy = stazpracy;
        this.tytulnaukowy = tytulnaukowy;
    }

    public String getPrzedmiot() {
        return przedmiot;
    }

    public int getStazpracy() {
        return stazpracy;
    }

    public String getTytulnaukowy() {
        return tytulnaukowy;
    }

    public void setPrzedmiot(String przedmiot) {
        this.przedmiot = przedmiot;
    }

    public void setStazpracy(int stazpracy) {
        this.stazpracy = stazpracy;
    }

    public void setTytulnaukowy(String tytulnaukowy) {
        this.tytulnaukowy = tytulnaukowy;
    }

    @Override
    public String toString() {
        return "Wykladowca{" + "przedmiot=" + przedmiot + ", stazpracy=" + stazpracy + ", tytulnaukowy=" + tytulnaukowy + " " + super.toString() + '}';
    }

    

}

