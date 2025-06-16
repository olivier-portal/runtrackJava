package Jour01;

import java.util.Arrays;
import java.util.Scanner;

public class Job03 {
    public static void main(String[] args) {
        int[] myArray = new int[10];

        for (int i = 0; i < 10; i++) {
            myArray[i] = i;
        }

        System.out.println("T0 = " + myArray[0]);
        System.out.println("T1 = " + myArray[1]);
        System.out.println("T5 = " + myArray[5]);
        System.out.println("T9 = " + myArray[9]);
        // Out of range
        //System.out.println("T10 = " + myArray[10]);
    }
}
