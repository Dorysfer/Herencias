/*
 * A continuación, se debe crear una subclase llamada Lavadora, con el atributo carga,
además de los atributos heredados.
Los constructores que se implementarán serán:
• Un constructor vacío.
• Un constructor con la carga y el resto de los atributos heredados. Recuerda que debes
llamar al constructor de la clase padre.
Los métodos que se implementara serán:
• Método get y set del atributo carga.
• Método crearLavadora (): este método llama a crearElectrodomestico() de la clase
padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
el atributo propio de la lavadora.
• Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500, si la
carga es menor o igual, no se incrementará el precio. Este método debe llamar al
método padre y añadir el código necesario. Recuerda que las condiciones que hemos
visto en la clase Electrodoméstico también deben afectar al precio.
 */
package Electrodomestico;

/**
 *
 * @author Home
 */
public class Lavadora extends Electrodomestico {

    private int carga;

    public Lavadora() {
    }

    public Lavadora(int carga) {
        this.carga = carga;
    }

    public Lavadora(int carga, int precio, String color, char consumoLetras) {
        super(precio, color, consumoLetras);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public int precioPorCarga() {
        carga = (int) (Math.random() * 50);

        if (this.carga >= 30) {
            this.precio += 1000;
            getPrecio();
        }
        System.out.println("El valor adicional de la capacidad de la lavadora de " + carga + " kg, es: " + getPrecio() + " $");
        return getPrecio();
    }

    @Override
    public int precioFinal() {
        this.precio = 1000 + this.precio;
        System.out.println("El precio final de la lavadora por consumo energético, peso, carga y peso base es: " + getPrecio() + " $");
        return getPrecio();
    }

    @Override
    public void crearElectrodomestico() {
        int precioBase = 1000;
        consumoEnergetico();
        comprobarColor();
        precioPeso();
        precioPorCarga();
        System.out.println("El precio base de la lavadora es: " + precioBase + " $");
        precioFinal();
        System.out.println("*************************Ð");

    }

}
