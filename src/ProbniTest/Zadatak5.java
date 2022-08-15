package ProbniTest;

import java.util.Arrays;

public class Zadatak5 {
    public static boolean contains(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num)
                return true;
        }

        return false;
    }

    public static int[] removeDuplicates(int[] arr) {
        int[] noviNiz = new int[arr.length];
        int brojac = 0;
        for (int i = 0; i < arr.length; i++) {
            if (!contains(noviNiz, arr[i])) {
                noviNiz[brojac] = arr[i];
                brojac++;
            }
        }
        int[] retVal = new int[brojac];
        for (int i = 0; i < brojac; i++) {
            retVal[i] = noviNiz[i];
        }
        return retVal;
    }

    public static void main(String[] args) {
        int [] arr = {1,1,2,3,3,4,5,2,8,90,8};
        System.out.println(Arrays.toString(removeDuplicates(arr)));
    }

}


