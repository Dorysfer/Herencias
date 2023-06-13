/*
 * Se debe crear también una subclase llamada Televisor con los siguientes atributos:
resolución (en pulgadas) y sintonizador TDT (booleano), además de los atributos
heredados.
Los constructores que se implementarán serán:
• Un constructor vacío.
• Un constructor con la resolución, sintonizador TDT y el resto de los atributos
heredados. Recuerda que debes llamar al constructor de la clase padre.


Los métodos que se implementara serán:
• Método get y set de los atributos resolución y sintonizador TDT.
• Método crearTelevisor(): este método llama a crearElectrodomestico() de la clase
padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
los atributos del televisor.
• Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
incrementará el precio un 30% y si tiene un sintonizador TDT incorporado, aumentará
$500. Recuerda que las condiciones que hemos visto en la clase Electrodomestico
también deben afectar al precio.
Finalmente, en el main debemos realizar lo siguiente:
Vamos a crear una Lavadora y un Televisor y llamar a los métodos necesarios para mostrar
el precio final de los dos electrodomésticos.
 */
package Electrodomestico;

import java.util.Random;

/**
 *
 * @author Home
 */
public class Televisor extends Electrodomestico {

    private int resolucion;
    private boolean sintonizador;
    

    public Televisor() {
    }

    public Televisor(int resolucion, boolean sintonizador, int precio, String color, char consumoLetras) {
        super(precio, color, consumoLetras);
        this.resolucion = resolucion;
        this.sintonizador = sintonizador;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizador() {
        return sintonizador;
    }

    public void setSintonizador(boolean sintonizador) {
        this.sintonizador = sintonizador;
    }

    
    

    public int precioPorResySint(){
       resolucion = (int) (aleatorio.nextInt(100));
        System.out.println("La resolucion de la pantalla es: "+resolucion+" pulgadas");
        sintonizador= aleatorio.nextBoolean();
        System.out.println("El televisor tiene sintonizador TDT? "+sintonizador);
        
        if (resolucion >= 40 ) {
          this.precio+=(int)(1.3*(this.precio));
            System.out.println("El precio adicional del televisor acorde a su resolución es: "+this.precio+" $");
        }
        if(sintonizador){
            this.precio+= 500; 
            System.out.println("El precio adicional del televisor acorde a la presencia de sintonizador TDT es: "+this.precio+" $");
        }  
        this.precio=this.precio;
        System.out.println("El precio del televisor por resolución y sintonizador es: " + getPrecio() + " $");
       return   getPrecio();
    }
    @Override
    public int precioFinal() {
       this.precio=1000+this.precio;
        System.out.println("El precio final de este televisor acorde a consumo energético, peso, resolución, sintonizador y precio base es: "+getPrecio()+" $");
        return getPrecio();
    }
    
    @Override
    public void crearElectrodomestico() {
        int precioBase=1000;
        consumoEnergetico();
        comprobarColor();
        precioPeso();
        precioPorResySint();
        System.out.println("El televisor tiene un precio base de: "+precioBase+" $");
        precioFinal();
        System.out.println("******************************Ð");
    }
}
