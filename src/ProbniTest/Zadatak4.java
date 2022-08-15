package ProbniTest;

import java.util.Scanner;

public class Zadatak4 {
    public static double saberiIOduzmi(double... brojevi) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Opcija 1= sabiranje, opcija 2 = oduzimanje");
        int unos = sc.nextInt();
        double suma = 0.0 ;
        if (unos == 1) {
            for (int broj = 0; broj < brojevi.length; broj++) {
                suma = suma + brojevi[broj];
            }
        }
        if (unos == 2) {
            for (int broj = 0; broj < brojevi.length; broj++) {
                suma = suma - brojevi [broj];
            }
        }
        return suma;
    }

    public static void main(String[] args) {
        System.out.println(saberiIOduzmi(1,2,3,4,5,7));
    }
}


