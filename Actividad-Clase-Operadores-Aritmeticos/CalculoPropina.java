import java.util.Scanner;

public class CalculoPropina {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Bienvenido al calculador de propina");
        System.out.print("Ingrese la cuenta total: ");
        int cuentaTotal = s.nextInt();
        System.out.println();
        System.out.print("Introduce el porcentaje de propina que desea dejar: ");
        int propina = s.nextInt();
        System.out.println("La cantidad que tiene que pagar es: " + calculoPropina(cuentaTotal, propina));
    }

    private static int calculoPropina(int cuentaTotal, int propina){
        return  cuentaTotal * (propina / 100);
    }
}
