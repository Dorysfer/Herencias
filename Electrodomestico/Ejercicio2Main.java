/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Electrodomestico;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dorys Erazo Ortega
 */
public class Ejercicio2Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Electrodomestico lavadora = new Lavadora();
        lavadora.crearElectrodomestico();
        Electrodomestico televisor = new Televisor();
        televisor.crearElectrodomestico();
        Electrodomestico lavadora1 = new Lavadora();
        lavadora1.crearElectrodomestico();
        Electrodomestico televisor1 = new Televisor();
        televisor1.crearElectrodomestico();
        List<Electrodomestico> elect = new ArrayList<>();
        elect.add(lavadora);
        elect.add(lavadora1);
        elect.add(televisor);
        elect.add(televisor1);
        int suma=0;
        suma = elect.stream().map((aux) -> {
            System.out.println(aux.getPrecio());
            return aux;
        }).map((aux) -> aux.precio).reduce(suma, Integer::sum);
        System.out.println("La suma del precio de estos electrodomésticos es: "+suma+" $");
    }

}
