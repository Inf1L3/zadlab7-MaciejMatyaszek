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
public class Student extends Osoba {

    private int numerindeksu;
    private String typStudiów;
    private String kierunek;
    private int rok;

    public Student(int numerindeksu, String typStudiów, String kierunek, int rok, String imie, String nazwisko, String dataUrodzenia, String płeć) {
        super(imie, nazwisko, dataUrodzenia, płeć);
        this.numerindeksu = numerindeksu;
        this.typStudiów = typStudiów;
        this.kierunek = kierunek;
        this.rok = rok;
    }

    public int getNumerindeksu() {
        return numerindeksu;
    }

    public String getTypStudiów() {
        return typStudiów;
    }

    public String getKierunek() {
        return kierunek;
    }

    public int getRok() {
        return rok;
    }

    public void setNumerindeksu(int numerindeksu) {
        this.numerindeksu = numerindeksu;
    }

    public void setTypStudiów(String typStudiów) {
        this.typStudiów = typStudiów;
    }

    public void setKierunek(String kierunek) {
        this.kierunek = kierunek;
    }

    public void setRok(int rok) {
        this.rok = rok;
    }

    @Override
    public String toString() {
        return "Student{" + "numerindeksu=" + numerindeksu + ", typStudi\u00f3w=" + typStudiów + ", kierunek=" + kierunek + ", rok=" + rok + " " + super.toString() + '}';
    }

}
