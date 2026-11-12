
import java.util.Scanner;

/**
 * Ejercicio 01: Día de la semana: Mostrar el nombre del día de la semana en 
 * función del número ingresado (1 para lunes, 2 para martes, etc.).
 * @author Romero Aarón, Duarte Aldredo.
 * @version 1.0
 */

public class Ejercicio02_DiaSemana {
    public static void main(String[] args) {
        String  nombreDia;
        Scanner tcl = new Scanner(System.in);
        System.out.println("Deme nro. de día: ");
        int nroDia = tcl.nextInt();
        if (nroDia > 7)
            System.out.println("Error");
        switch (nroDia)
        {
            case 1:
                nombreDia = "lunes";
                break;
            case 2:
                nombreDia = "Martes";
                break;
            case 3:
                nombreDia = "Miércoles";
                break;
            case 4:
                nombreDia = "Jueves";
                break;
            case 5:
                nombreDia = "Viernes";
                break;
            case 6:
                nombreDia = "Sábado";
                break;
            case 7:
                nombreDia = "Domingo";
                break;
            default:
                nombreDia = "error";
        
        }
        System.out.println("El numero día " + nroDia + " corresponde a " 
                + nombreDia);
    }
}

/***
 * EVIDENCIA DEL RUN:
Deme nro. de día: 
2
El numero día 2 corresponde a Martes
BUILD SUCCESSFUL (total time: 6 seconds)
 */
