package Jour01;

import java.util.Scanner;

public class Job08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Veuillez entrer 1 nombre entier: ");
        int number = sc.nextInt();
        int somme = 0;

        for (int i = 1; i <= number; i++) {
            int cube = (int) Math.pow(i, 3);
            somme += cube;
        }

        System.out.printf("La somme des cubes des nombres de 1 à %d est de : %d ", number, somme);
    }
}
