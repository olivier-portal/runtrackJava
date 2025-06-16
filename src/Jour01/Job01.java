package Jour01;

import java.util.Scanner;

public class Job01 {
    //init class main
    public static void main(String[] args) {
        // Create an object Scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir un message: ");
        String message = sc.nextLine();
        System.out.println("Votre message: " + message);
    }
}
