package Jour01;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Job05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        double[] nombres = new double[3];

        System.out.println("Veuillez saisir trois nombres: ");

        for (int i = 0; i < 3; i++) {
            while (true) {
                System.out.print("Nombre " + (i + 1) + " : ");
                try {
                    nombres[i] = Double.parseDouble(sc.nextLine().replace(",", "."));
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Entrée invalide. Veuillez saisir un nombre valide.");
                }
            }
        }

        Arrays.sort(nombres);

        System.out.printf("Les deux plus grands nombres sont: %.2f et %.2f\n", nombres[1], nombres[2]);
    }
}
