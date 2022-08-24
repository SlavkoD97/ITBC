package Domaci4;

import java.util.Scanner;

public class Zadatak3 {

    public static int negativeCount(int[] niz) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Lokacija1");
        int x = sc.nextInt();
        System.out.println("Lokacija2");
        int y = sc.nextInt();

        int negativeCounter = 0;

        for (int i = x - 1; i <= y; i++) {
            if (niz[i] < 0) {
                    negativeCounter = negativeCounter + 1;
                }
            }
        System.out.println("Od indeksa "+ x + " do indeksa " + y + " nalaze se " + negativeCounter + " negativna broja.");

        return negativeCounter; }





    public static void main(String[] args) {
        int [] niz1 = {-1,2,3,-6,-3,-2,5,8,-6,-2,-6};


        negativeCount(niz1);








    }

}



