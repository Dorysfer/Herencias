/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1_Animal;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Home
 */
public class Ejercicio1Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal perro = new Perro("Bruno", "Barf cocida", "Pastor Inglés", 1);
        perro.alimentacion();
        Animal perro1 = new Perro("Blondie", "Cani Senior", "Labrador", 12);
        perro1.alimentacion();
        Animal gato = new Gato("Garfield", "Lasagna", "45", 5);
        gato.alimentacion();
        Animal caballo = new Caballo("Tiro al Blanco", "Heno", "Pura Sangre", 5);
        caballo.alimentacion();
    }

}
