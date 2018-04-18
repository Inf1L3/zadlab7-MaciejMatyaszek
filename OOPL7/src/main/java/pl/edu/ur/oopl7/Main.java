/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl7;

import pl.edu.ur.oopl7.zadanie1.Student;
import pl.edu.ur.oopl7.zadanie1.Wykladowca;

/**
 *
 * @author student
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student s1 = new Student(0, "asas", "fizyka", 0, "adam", "nowak", "12.12.97", "M");
        System.out.println(s1.toString());
        Wykladowca w1 = new Wykladowca("Fizyka", 8, "doktor", "Jacek", "Miszcz", "12.11.1975", "M");
        System.out.println(w1.toString());
        // TODO code application logic here
    }
    
}
