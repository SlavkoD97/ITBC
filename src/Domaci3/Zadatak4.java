package Domaci3;

public class Zadatak4 {

    public static void compareNums(int num1, int num2) {

        if (num1 > num2) {
            System.out.println("Broj je veci od drugog broja");
        } else if (num1 < num2) {
            System.out.println("Broj je manji od drugog broja");
        } else {
            System.out.println("Broj je isti kao drugi broj");
        }
    }

        public static void main (String[]args){

         compareNums(5,4);
         compareNums(5,5);
         compareNums(5,88);

        }
    }
