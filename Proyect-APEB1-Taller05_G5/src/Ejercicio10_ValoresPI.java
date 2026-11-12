
import java.util.Scanner;

/**
 * Ejercicio 10: Valores pares o impares: Dado un valor entero ingresado por 
 * teclado (positivo o negativo), determinar si se trata de un valor par o 
 * impar.
 * @author Romero Aarón, Duarte Alfredo
 * @version 1.0
 */

public class Ejercicio10_ValoresPI {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.println("Ingrese un número (puede ser positivo o "
                + "negativo): ");
        int numero;
        numero = tcl.nextInt();
        if (numero %2 == 0)
            System.out.println("El número es par.");
        else
            System.out.println("El número es impar.");
        
    }
}

/***
 * EVIDENCIA DEL RUN:
run-single:
Ingrese un número (puede ser positivo o negativo): 
-7
El número es impar
BUILD SUCCESSFUL (total time: 8 seconds)

 */