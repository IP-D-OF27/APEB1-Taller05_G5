import java.util.Scanner;
/**
 * Ejercicio 07: "Rango de Notas: Asignar una letra (A, B, C, D) a una
 * calificación en función de su rango (A para 90-100, B para 80-89, etc.)."
 * @author Alfredo Duarte, Aaron Romero
 * @version 1.0
 */

public class Ejercicio07_RangoNotas {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int nota = 0;
        char letra = ' ';
        
        System.out.println("Ingresa la calificacion entre 0 - 100");
        nota = tcl.nextInt();
        if (nota > 100 || nota < 0){
            System.out.println("Error, la nota debe estar ente 0 a 100");
        } else {
            if (nota >= 90) {
                letra = 'A';
            } else if (nota >= 80) {
                letra = 'B';
            } else if (nota >= 70) {
                letra = 'c';
            } else if (nota >= 60) {
                letra = 'D';
            } else {
                letra = 'F';
            }
            System.out.println("El rango de la calificacion es: " + letra);
            }
    }
}

/***
 * EVIDENCIA DEL RUN:
 * run:
Ingresa la calificacion entre 0 - 100
89
El rango de la calificacion es: B
BUILD SUCCESSFUL (total time: 3 seconds)
 */