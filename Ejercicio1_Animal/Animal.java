/*
 * Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un
mensaje por pantalla informando de que se alimenta. Generar una clase Main que realice lo
siguiente:
 */
package Ejercicio1_Animal;

/**
 *
 * @author Home
 */
public class Animal {
    
    protected String nombre, alimento, raza;
    protected Integer edad;

    public Animal() {
    }

    public Animal(String nombre, String alimento, String raza, Integer edad) {
        this.nombre = nombre;
        this.alimento = alimento;
        this.raza = raza;
        this.edad = edad;
    }
    
    public void alimentacion(){
        System.out.println(this.nombre+ " se alimenta con "+this.alimento);
    }
    
    
}
