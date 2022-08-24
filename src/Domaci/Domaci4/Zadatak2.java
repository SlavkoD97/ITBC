package Domaci4;

public class Zadatak2 {


    public static int almostMax(int[] niz) {

        for (int i = 0; i < niz.length; i++) {
            for (int j = 0; j < niz.length - i - 1; j++) {
                if (niz[j] > niz[j + 1]) {
                    int temp = niz[j];
                    niz[j] = niz[j + 1];
                    niz[j + 1] = temp;

                }
            }
        }
        for (int i = niz.length - 2; i >= 0; i--) {
            if ( niz[i] != niz[i + 1] || i == 0){
                return niz[i];
            }

        }
        return -1;
    }

    public static void main(String[] args) {

        int[] niz = {2, 4, 1, 7, 3, 6};

        System.out.println("Drugi najveci broj je:" + almostMax(niz));

        int[] niz2 = {5, 3, 2, 6, 6, 8, 8};

        System.out.println("Drugi najveći broj je:" + almostMax(niz2));

        int[] niz3 = {1,568,65,111,87};

        System.out.println("Drugi najveci broj je:" + almostMax(niz3));

    }



}