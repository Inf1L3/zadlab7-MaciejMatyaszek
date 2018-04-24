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
////        Student s1 = new Student(0, "asas", "fizyka", 0, "adam", "nowak", "12.12.97", "M");
////        System.out.println(s1.toString());
////        Wykladowca w1 = new Wykladowca("Fizyka", 8, "doktor", "Jacek", "Miszcz", "12.11.1975", "M");
////        System.out.println(w1.toString());
////        // TODO code application logic here
      Punkt2D p1 = new Punkt2D(1, 2);
        p1.Wylosuj();
        System.out.println(p1.toString());
       Punkt3D pd1= new Punkt3D(1, 2, 3);
       pd1.Wylosuj();
        System.out.println(pd1.toString());
        Punkt2D[] array2D = new Punkt2D[100];
        Punkt3D[] array3D = new Punkt3D[100];
        for(int i=0; i<100; i++){
            array2D[i].Wylosuj();
        }
        for (int j=0; j<100; j++){
            array3D[j].Wylosuj();
        }

            for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 10; j++) {
                if (array2D[i].getX() == array3D[j].getX() && array2D[i].getY() == array3D[j].getY()) {
                    System.out.println( ". " + array2D[i].toString());
                    System.out.println(  ". " + array3D[j].toString());
                    
                }
        }
       
    }}}