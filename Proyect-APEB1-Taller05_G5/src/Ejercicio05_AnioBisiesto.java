import java.util.Scanner;
/**
 * Ejercicio 05: "Año Bisiesto: Comprobar si un año ingresado es bisiesto o no.
 * Si es bisiesto, mostrar un mensaje especial."
 * @author Alfredo Duarte, Aaron Romero
 * @version 1.0
 */

public class Ejercicio05_AnioBisiesto {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int anio = 0;
        int division = 0;
        int comprobacion = 0;
        boolean bisiesto = false;
        
        System.out.println("Ingrese el anio");
        anio = tcl.nextInt();
        division = anio / 4;
        comprobacion = division * 4;
        
        if (comprobacion == anio) {
            bisiesto = true;
        }
        if (bisiesto == true) {
            System.out.println("El anio " + anio + " es Bisiesto, tiene un dia "
                    + "extra");
        } else {
            System.out.println("El anio " + anio + " no es Bisiesto");
        }
    }
}

/***
 * EVIDENCIA DEL RUN:
 * run:
Ingrese el anio
2020
El anio 2020 es Bisiesto, tiene un dia extra
BUILD SUCCESSFUL (total time: 3 seconds)
 */
