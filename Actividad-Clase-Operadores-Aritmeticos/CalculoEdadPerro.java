import java.util.Scanner;

public class CalculoEdadPerro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa la edad de tu perro: ");
        int edadPerro = scanner.nextInt();

        int edadHumana = calcularEdadHumana(edadPerro);
        System.out.println("La edad de tu perro en años humanos es: " + edadHumana);
    }

    public static int calcularEdadHumana(int edadPerro) {
        if (edadPerro <= 2) {
            return edadPerro * 7;
        } else {
            return 14 + ((edadPerro - 2) * 5);
        }
    }
}
