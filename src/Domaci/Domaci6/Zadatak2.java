package Domaci6;

import java.util.Arrays;
import java.util.*;

public class Zadatak2 {

    public static void printMatrix (int [][] matrix){

        for (int i = 0 ; i<matrix.length;i++){
            for (int j = 0; j< matrix[0].length;j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int [] [] findMax(int[][] matrix) {

        int maxColValue = Integer.MIN_VALUE;
        int maxColIndex = -1;
        int colValue = 0;

        for (int i = 0; i < matrix[0].length; i++) {
            colValue = 0;
            for (int j = 0; j < matrix.length; j++) {
                colValue += matrix[j][i];

                if (colValue > maxColValue) {
                    maxColIndex = i;
                    maxColValue = colValue;

                }


            }
        }
        int [] noviNiz = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++){
            noviNiz [i] = matrix [i][maxColIndex];
        }
        for (int i = maxColIndex; i > 0; i--){
            for (int j = 0; j < matrix.length; j++){
                matrix[j][i] = matrix [j][i - 1];
            }
        }
        for (int i = 0; i < matrix.length; i++){
            matrix [i][0] = noviNiz [i];
        }

            return matrix;


    }



    public static void main(String[] args) {
        int[][] matrix = { { 3, 2, 1, 7 },
                { 9, 11, 5, 4 },
                { 6, 0, 13, 17 },
                { 7, 21, 14, 15 } };

        int[][] finalMatrix = new int [matrix.length][matrix[0].length];
        finalMatrix = findMax(matrix);

        printMatrix(finalMatrix);



    }
}

