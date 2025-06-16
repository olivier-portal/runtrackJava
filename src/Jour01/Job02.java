package Jour01;

import java.util.Scanner;

public class Job02 {
    //init class main
    public static void main(String[] args) {
        // Create an object Scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir votre prénom: ");
        String message = sc.nextLine();
        System.out.println("Bonjour " + message);
    }
}
