
import java.util.Scanner;

/**
 * Ejercicio 06: Categoría de Edad: Clasificar a una persona en una categoría 
 * de edad (niño, adolescente, adulto) en función de su edad.
 * @author Romero Aarón, Duarte Alfredo.
 * @version 1.0
 */

public class Ejercicio06_CatEdad {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.println("Hola, porfavor ingrese su edad: ");
        int edad = tcl.nextInt();
        if (edad >=0 && edad <= 12)
            System.out.println("Usted es un/a niño/a.");
        else if (edad > 12 && edad <= 18)
            System.out.println("Usted es un adolescente.");
        else
            System.out.println("Usted es un adulto.");
    }
}

/***
 * EVIDENCIA DEL RUN:
run-single:
Hola, porfavor ingrese su edad: 
18
Usted es un adolescente.
BUILD SUCCESSFUL (total time: 4 seconds)
 */