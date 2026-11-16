import java.util.Scanner;
/**
 * Ejercicio 11: "Pedidos online: Desarrollar una solución que imprima el costo
 * de un pedido de un artículo del cual se tiene la descripción, la cantidad que
 * se requiere y el precio unitario. Si la cantidad pedida excede de 50 unidades
 * , se hace un descuento de 15%."
 * @author Alfredo Duarte, Aaron Romero
 * @version 1.0
 */

public class Ejercicio11_PedidosOnline {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        String descripcion = " ";
        int cantidad;
        double precioUni;
        double subtotal;
        double descuento = 0;
        double total;
        
        System.out.println("Escriba la descripcion del articulo: ");
        descripcion = tcl.nextLine();
        System.out.println("Cantidad requerida: ");
        cantidad = tcl.nextInt();
        System.out.println("Ingrese el precio unitario: ");
        precioUni = tcl.nextDouble();
        
        subtotal = cantidad * precioUni;
        if (cantidad > 50) {
            descuento = subtotal * 0.15;
        }
        total = subtotal - descuento;
        System.out.println(" ");
        System.out.println("Pedido:");
        System.out.println("Articulo: " + descripcion);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Subtotal: " + subtotal);
        System.out.println("Descuento: " + descuento);
        System.out.println("Valor a pagar: " + total);
    }
}

/***
 * EVIDENCIA DEL RUN:
 * run:
Escriba la descripcion del articulo: 
Shampoo Garnier Fructis 
Cantidad requerida: 
56
Ingrese el precio unitario: 
5,34

Pedido:
Articulo: Shampoo Garnier Fructis 
Cantidad: 56
Subtotal: 299.03999999999996
Descuento: 44.855999999999995
Valor a pagar: 254.18399999999997
BUILD SUCCESSFUL (total time: 56 seconds)
 */