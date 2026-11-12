
import java.util.Scanner;

/**
 * Ejercicio 08: Calculadora de IMC: Calcular el índice de masa corporal (IMC) 
 * de una persona y clasificarla en función de su valor (bajo peso, peso normal,
 * sobrepeso, etc.).
 * @author Romero Aarón, Duarte Alfredo. 
 * @version 1.0
 */

public class Ejercicio08_CalcuIMC {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.print("Ingrese su peso en Kg: ");
        double peso = tcl.nextDouble();
        System.out.print("Ahora ingrese su altura: ");
        double altura = tcl.nextDouble();
        double IMC;
        IMC = (peso / Math.pow (altura, altura));
        if (IMC <= 18.5)
        {
            System.out.printf("Su indice de masa corporal es de: %.2f%n", IMC);
            System.out.println("(Usted está con un peso muy bajo.)");
        }
        if (IMC > 18.5 && IMC <= 24.9)
        {
            System.out.printf("Su indice de masa corporal es de: %.2f%n", IMC);
            System.out.println("(Usted está con un peso normal, nada de que "
                    + "preocuparse.)");
        }
        if (IMC >= 25 && IMC < 29.9)
        {
            System.out.printf("Su indice de masa corporal es de: %.2f%n", IMC);
            System.out.println("(Usted está con sobre peso, evite una mala "
                    + "rutina alimentaria.)");
        }
        if (IMC >= 30)
        {
            System.out.printf("Su indice de masa corporal es de: %.2f%n", IMC);
            System.out.println("(ALERTA. Usted tiene sobrepeso, debería "
                    + "mejorar la alimentación por su bien.)");
        }
    }
}

/***
 * EVIDENCIA DEL RUN:
run-single:
Ingrese su peso en Kg: 60
Ahora ingrese su altura: 1,75
Su indice de masa corporal es de: 22,53
(Usted está con un peso normal, nada de que preocuparse)
BUILD SUCCESSFUL (total time: 8 seconds)
 */