package ProbniTest;

import java.util.Arrays;

public class Zadatak3 {
    public static int[] incrementedElements(int[] x, int number) {

        int [] y = new int[x.length];
        for (int i = 0; i < x.length; i++) {
            x[i] += number;
            y[i] = x[i];
        }
        return y;
    }




    public static void main(String[] args) {
        int[] x = {1, 2, 3, 10, 5};
        int[] y = incrementedElements(x,3);

        System.out.println(Arrays.toString(y));


    }
}

