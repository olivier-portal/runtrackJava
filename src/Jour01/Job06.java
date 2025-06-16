package Jour01;

import java.util.Scanner;

public class Job06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double somme = 0;
        double saisie;

        System.out.println("Veuillez entrer 5 nombres entiers: ");

        for (int i = 0; i < 5; i++) {
            while (true) {
                System.out.print("Nombres " + (i + 1) + " : ");
                try {
                    saisie = Double.parseDouble(sc.nextLine().replace(",", "."));
                    somme += saisie;
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Entrée invalide. Veuillez saisir un entier.");
                }
            }
        }
        double moyenne = (double) somme / 5;
        System.out.printf("La moyenne des nombres entrez est de : %.2f", moyenne);
    }
}
