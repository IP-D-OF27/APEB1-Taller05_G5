import java.util.Scanner;
/**
 * Ejercicio 09: "Ordenamiento de Tres Números: Dados tres números, ordenarlos 
 * en orden ascendente."
 * @author Alfredo Duarte, Aaron Romero
 * @version 1.0
 */

public class Ejercicio09_OrdenTresNum {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int menor;
        int medio;
        int mayor;
        
        System.out.println("Ingrese el primer numero: ");
        num1 = tcl.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        num2 = tcl.nextInt();
        System.out.println("Ingrese el tercer numero: ");
        num3 = tcl.nextInt();
        
        if (num1 <= num2 && num1 <= num3) {
            menor = num1;
            if (num2 <= num3) {
                medio = num2;
                mayor = num3;
            } else {
                medio = num3;
                mayor = num2;
            }
        } else if (num2 <= num1 && num2 <= num3){
            menor = num2;
            if (num1 <= num3) {
                medio = num1;
                mayor = num3;
            } else {
                medio = num3;
                mayor = num1;
            }
        } else {
            menor = num3;
            if (num1 <= num2) {
                medio = num1;
                mayor = num2;
            } else {
                medio = num2;
                mayor = num1;
            }
        }
        System.out.println("Los numeros ordenados de forma ascendente son: " 
                + menor + ", " + medio + ", " + mayor);
    }
}

/***
 * EVIDENCIA DEL RUN:
 * run:
Ingrese el primer numero: 
23
Ingrese el segundo numero: 
42
Ingrese el tercer numero: 
12
Los numeros ordenados de forma ascendente son: 12, 23, 42
BUILD SUCCESSFUL (total time: 6 seconds)
 */
