package Domaci5;

public class Zadatak2 {
    public static boolean ifDuplicates(int[] arr1, int[] arr2) {

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++)
                if (arr1[i] == arr2[j]) return true;

        }
        return false;
    }

    public static void main(String[] args) {


        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {6, 7, 3, 8, 9};
        int[] arr3 = {10,11,2,12,};

        System.out.println(ifDuplicates(arr1,arr2));
        System.out.println(ifDuplicates(arr2,arr3));
        System.out.println(ifDuplicates(arr3,arr1));
    }
}