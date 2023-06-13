/*
 * Crear una superclase llamada Electrodoméstico con los siguientes atributos: precio, color,
consumo energético (letras entre A y F) y peso.
Los constructores que se deben implementar son los siguientes:
• Un constructor vacío.
• Un constructor con todos los atributos pasados por parámetro.
Los métodos a implementar son:
• Métodos getters y setters de todos los atributos.
• Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta,
sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el
objeto y no será visible.
• Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es,
usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son
blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en
minúsculas. Este método se invocará al crear el objeto y no será visible.

13

• Metodo crearElectrodomestico(): le pide la información al usuario y llena el
electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al
precio se le da un valor base de $1000.
• Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del
precio. Esta es la lista de precios:
 */
package Electrodomestico;

import java.util.Random;

/**
 *
 * @author Home
 */
public class Electrodomestico {

    protected int precio;
    protected String color;
    protected char consumoLetras;

    public Electrodomestico() {
    }

    public Electrodomestico(int precio, String color, char consumoLetras) {
        this.precio = precio;
        this.color = color;
        this.consumoLetras = consumoLetras;
    }

   

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoLetras() {
        return consumoLetras;
    }

    public void setConsumoLetras(char consumoLetras) {
        this.consumoLetras = consumoLetras;
    }

    public Random getAleatorio() {
        return aleatorio;
    }

    public void setAleatorio(Random aleatorio) {
        this.aleatorio = aleatorio;
    }

    

    Random aleatorio = new Random();

    public int consumoEnergetico() {

        for (int i = 0; i < 6; i++) {
            this.consumoLetras = (char) (aleatorio.nextInt(6) + 'A');
        }
        System.out.println("La clasificación energética es: " + getConsumoLetras());

        switch (getConsumoLetras()) {
            case 'A':
                this.precio+= 1000;
                getPrecio();
                break;
            case 'B':
                this.precio+= 800;
                getPrecio();
                break;
            case 'C':
                this.precio+= 600;
                getPrecio();
                break;
            case 'D':
                this.precio+=500;
                getPrecio();
                break;
            case 'E':
               this.precio+=300;
                getPrecio();
                break;
            case 'F':
                this.precio+= 100;
                getPrecio();
                break;
            default:
                System.out.println('F');
                this.precio+= 100;
                getPrecio();
                break;
        }
        System.out.println("El precio acorde a su clasificación energética es: " + this.precio + " $");
        return getPrecio();
    }

    public String comprobarColor() {
        int opcion = 0;
        for (int i = 1; i < 6; i++) {
            opcion = (int) (aleatorio.nextInt(6));
        }
        switch (opcion) {
            case 1:
                this.color = "Blanco";
                break;
            case 2:
                this.color = "Negro";
                break;
            case 3:
                this.color = "Rojo";
                break;
            case 4:
                this.color = "Azul";
                break;
            case 5:
                this.color = "Gris";
                break;
            default:
                this.color = "Blanco";
                break;
        }
        System.out.println("El color de este electrodoméstico es: "+getColor());
        return getColor();
    }
    public int precioPeso(){
        int peso=(int) (aleatorio.nextInt(100));
        if(peso<=19){
            this.precio+=100;
        }else if(peso>=20 && peso<=49 ){
            this.precio+=500;
        } else if(peso>=50 && peso<=79){
            this.precio+=800;
        }else{
            this.precio+=1000;
        }
        System.out.println("El precio de este electrodoméstico acorde a su clasificación energética y peso de " +peso+" kg, es: "+getPrecio()+" $");
        return getPrecio();
    }
    public void crearElectrodomestico(){
        int precioBase=1000;
        consumoEnergetico();
        comprobarColor();
        precioPeso();
        System.out.println("El precio base del electrodoméstico es: "+precioBase+" $");
        precioFinal();
        
    }
    public int precioFinal(){
       this.precio=1000+this.precio; 
        System.out.println("El precio final es: "+getPrecio()+" $");
       return getPrecio();
    }
}
