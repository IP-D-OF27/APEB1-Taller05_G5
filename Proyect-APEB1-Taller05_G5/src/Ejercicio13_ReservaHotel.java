import java.util.Scanner;
/**
 * Ejercicio 13: "Sistema de reservas hoteleras: En una hostería de la ciudad de
 * Loja se hace un descuento del 10% si el cliente se hospeda más de 5 días,
 * del 15% si se hospeda más de 10 días y del 20% si se hospeda más de 15 días.
 * Elaborar una solución que pida el número de días y el precio diario de la
 * habitación y luego calcule e imprima el subtotal por pagar, el descuento y el
 * total por pagar"
 * @author Alfredo Duarte, Aaron Romero;
 * @version 1.0
 */

public class Ejercicio13_ReservaHotel {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int dias = 0;
        double valorDia = 25.25;
        double subtotal;
        double descuento = 0;
        double total;
        
        System.out.println("Ingrese la cantidad de dias a hospedarse: ");
        dias = tcl.nextInt();
        
        subtotal = dias * valorDia;
        if (dias > 5) {
            descuento = subtotal * 0.10;
        } else if (dias > 10) {
            descuento = subtotal * 0.15;
        } else if (dias > 15) {
            descuento = subtotal * 0.20;
        }
        total = subtotal - descuento;
        
        System.out.println("");
        System.out.println("Cantidad de dias: " + dias);
        System.out.println("Precio por dia: " + valorDia);
        System.out.println("Subtotal: " + subtotal);
        System.out.println("Descuento: " + descuento);
        System.out.println("Total: " + total);
    }
}

/***
 * EVIDENCIA DEL RUN:
 * run:
Ingrese la cantidad de dias a hospedarse: 
13

Cantidad de dias: 13
Precio por dia: 25.25
Subtotal: 328.25
Descuento: 32.825
Total: 295.425
BUILD SUCCESSFUL (total time: 3 seconds)

 */