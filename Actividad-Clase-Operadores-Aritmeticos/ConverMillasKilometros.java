import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

public class ConverMillasKilometros {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Bienvenido al conversor de millas a kilometros.");
        System.out.print("Introduzca las millas que desea convertir: ");
        int millas = s.nextInt();
        System.out.println(millas + " millas en kilometros son : " + millasToKilometros(millas));

    }

    private static double millasToKilometros(int millas){
        return millas * 1.60934;
    }
}
