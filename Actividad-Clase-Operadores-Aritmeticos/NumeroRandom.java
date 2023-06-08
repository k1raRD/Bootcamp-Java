import java.util.Random;
import java.util.Scanner;

public class NumeroRandom {
    public static void main(String[] args) {
        Random random = new Random();
        int numeroAdivinar = random.nextInt(100) + 1;

        Scanner scanner = new Scanner(System.in);
        int intentos = 0;
        int numeroAdivinado;

        System.out.println("Adivina el número entre 1 y 100:");

        do {
            System.out.print("Ingresa tu intento: ");
            numeroAdivinado = scanner.nextInt();
            intentos++;

            if (numeroAdivinado < numeroAdivinar) {
                System.out.println("El número a adivinar es mayor.");
            } else if (numeroAdivinado > numeroAdivinar) {
                System.out.println("El número a adivinar es menor.");
            } else {
                System.out.println("¡Felicitaciones! Adivinaste el número en " + intentos + " intento(s).");
            }
        } while (numeroAdivinado != numeroAdivinar);
    }
}
