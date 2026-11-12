
import java.util.Scanner;

/**
 * Ejercicio 04: Descuento en Compras: Calcular el precio final de un producto 
 * con un descuento del 10% si el precio original es mayor de $100; de lo 
 * contrario, no hay descuento.
 * @author Romero Aarón, Duarte Alfredo.
 * @version 1.0
 */

public class Ejercicio04_DescuentoCompras {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.println("Ingrese porfavor el precio del producto: ");
        double precio = tcl.nextDouble();
        double precioDescuento;
        if (precio > 100)
        {
            precioDescuento = ( precio * 0.90);
            System.out.println("Felicidades, ha sido acreedor a un descuento "
                    + "del 10%, el total a pagar es de: " + precioDescuento + 
                    " USD ");
        }
         System.out.print("Su total a pagar es de: " + precio + " USD ");
    }
}

/***
 * EVIDENCIA DEL RUN:
run-single:
Ingrese porfavor el precio del producto: 
250
Felicidades, ha sido acreedor a un descuento del 10%, el total a pagar es de: 
* 225.0 USD 
BUILD SUCCESSFUL (total time: 8 seconds)
 */