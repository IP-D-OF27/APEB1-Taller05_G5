import java.util.Scanner;
/**
 * Ejercicio 01: "Determinar si una persona es elegible para votar en función de
 * su edad (mayor o igual a 16 años)."
 * @author Alfredo Duarte, Aaron Romero
 * @version 1.0
 */

public class Ejercicio01_LegibleVotacion {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.print("Deme edad: ");
        int edad = tcl.nextInt();
        if (edad >= 16)
            System.out.println("Es legible para votar");
        else
            System.out.println("No legible para votar");
    }
}

/***
 * EVIDENCIA DEL RUN:
 run:
Deme edad: 18
Es legible para votar
BUILD SUCCESSFUL (total time: 9 seconds)
 */
