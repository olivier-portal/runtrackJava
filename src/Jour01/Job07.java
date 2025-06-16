package Jour01;

public class Job07 {
    public static void main(String[] args) {

        int somme = 0;

        for (int i = 1; i <= 100; i++) {
            somme += i;
        }
        System.out.printf("La somme des 100 premiers entiers est de : %d", somme);
    }
}
