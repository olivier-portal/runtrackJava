package Jour01;

import java.util.Locale;
import java.util.Scanner;

public class Job04 {
     public static void main(String[] args) {
         Locale.setDefault(Locale.US);
         Scanner sc = new Scanner(System.in);
         System.out.println("Veuillez saisir un nombre: ");
         double enteredNumber = sc.nextDouble();
         double squaredNumber = Math.pow(enteredNumber, 2);
         System.out.println("Le carré de " + enteredNumber + " est de: " + squaredNumber);
    }
}
