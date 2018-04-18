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
public class Osoba {
    private String imie;
    private String nazwisko;
    private String dataUrodzenia;
    private String płeć;

    public Osoba(String imie, String nazwisko, String dataUrodzenia, String płeć) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.dataUrodzenia = dataUrodzenia;
        this.płeć = płeć;
    }
    
    @Override
    public String toString() {
        return "Osoba{" + "imie=" + imie + ", nazwisko=" + nazwisko + ", dataUrodzenia=" + dataUrodzenia + ", p\u0142e\u0107=" + płeć + '}';
    }
    
}
