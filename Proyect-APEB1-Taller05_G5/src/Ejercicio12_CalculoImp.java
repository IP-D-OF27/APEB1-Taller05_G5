
import java.util.Scanner;

/**
 * Ejercicio 12: Calculo de impuestos: Desarrollar una solución que permita 
 * leer los datos de un automóvil (marca, origen y costo) imprima el impuesto 
 * por pagar y el precio de venta (incluido el impuesto). Si el origen es 
 * Alemania el impuesto es 20%, si es de Japón el impuesto es 30%, si es de 
 * Italia, 15%, y si es de USA, 8%
 * @author Romero Aarón, Duarte Alfredo
 * @version 1.0
 */

public class Ejercicio12_CalculoImp {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.print("Ingrese la marca del automóvil: ");
        String marca = tcl.nextLine();
        System.out.print("Ingrese el país de origen: ");
        String pais = tcl.nextLine();
        System.out.print("Ingrese el precio del automóvil: ");
        double costo = tcl.nextDouble();
        double Impuesto;
        Impuesto = 0;
        if ("Alemania".equals(pais))
            Impuesto = costo * 0.20;
        else if ("Italia".equals(pais))
            Impuesto = costo * 0.30;
        else if ("Japon".equals(pais))
            Impuesto = costo * 0.15;
        else if ("USA".equals(pais))
            Impuesto = costo * 0.08;
        else {
            System.out.println("El pais ingresado no se encuentra listado, no "
                    + "se puede proceder con el cálculo.");
        }
        double total;
        total = costo + Impuesto;
        System.out.println("Su total de impuesto a pagar es: "+ Impuesto + 
                " USD ");
        System.out.println("El precio de venta es: " + total + " USD ");
        
    }
}

/***
 * EVIDENCIA DEL RUN:
 compile-single:
run-single:
Ingrese la marca del automóvil: fORD
Ingrese el país de origen: USA
Ingrese el precio del automóvil: 114,220
Su total de impuesto a pagar es: 9.1376 USD 
El precio de venta es: 123.3576 USD 
BUILD SUCCESSFUL (total time: 21 seconds)
 */