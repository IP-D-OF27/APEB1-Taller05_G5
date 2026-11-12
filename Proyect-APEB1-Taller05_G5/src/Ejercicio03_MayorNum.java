import java.util.Scanner;
/**
 * Ejercicio 03: "Mayor de tres números: Dados tres números distintos,
 * determinar cuál es el mayor."
 * @author Alfredo Duarte, Aaron Romero
 * @version 1.0
 */
public class Ejercicio03_MayorNum {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.println("Deme 3 num");
        int n1 = tcl.nextInt(), n2 = tcl.nextInt(), n3 = tcl.nextInt(), mayor;
        if (n1 > n2)
            mayor = n1;
        else
            mayor = n2;
        if (mayor > n3)
            mayor = mayor;
        else
            mayor = n3;
        System.out.println(mayor);
    }
}
/***
 * EVIDENCIA DEL RUN:
 run:
Deme edad: 18
Es legible para votar
BUILD SUCCESSFUL (total time: 9 seconds)
 */