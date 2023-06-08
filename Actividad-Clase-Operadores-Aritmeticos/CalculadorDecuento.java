import java.util.Scanner;

public class CalculadorDecuento {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Bienvenido al programa de descuentos");
        System.out.print("Introduce el precio original del producto: ");
        int precioOriginal = s.nextInt();
        System.out.println();
        System.out.print("Introduce el descuento del producto: ");
        int descuento = s.nextInt();
        System.out.println();
        System.out.println("La cantidad que tienes que pagar es: " + calculoPrecio(precioOriginal, descuento));
    }

    private static int calculoPrecio(int precioOriginal, int descuento){
        return precioOriginal - (precioOriginal * descuento / 100);
    }
}
