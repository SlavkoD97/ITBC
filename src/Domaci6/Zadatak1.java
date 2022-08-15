package Domaci6;

import java.util.*;

public class Zadatak1 {

    public static int [] findMax(int[][] mat) {


        int maxRowValue = Integer.MIN_VALUE ;
        int maxRowIndex = -1;
        int rowValue = 0;

        for (int i = 0; i < mat.length; i++) {
            rowValue = 0;
            for (int j = 0; j < mat[i].length; j++) {


                rowValue  += mat [i][j] ;
            }

            if (rowValue > maxRowValue) {
                maxRowIndex = i;
                maxRowValue = rowValue;


            }
        }

            int [] retValue = new int[mat[0].length];

            for (int i = 0; i < mat[0].length  ; i++){
                retValue [i] = mat[maxRowIndex][i];
            }
        return retValue ;
    }

    public static void main(String[] args) {
        int[][] matrix = {{3, 2, 1, 7},
                {9, 11, 5, 4},
                {6, 0, 13, 17},
                {7, 21, 14, 15},};

        System.out.println(Arrays.toString(findMax(matrix)));
    }
}


