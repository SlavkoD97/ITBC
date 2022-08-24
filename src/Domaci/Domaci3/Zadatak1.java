package Domaci3;

public class Zadatak1 {

    public static boolean isLeap(int year){


        if (year % 4 == 0 && (year % 400 == 0 || year % 100 != 0)) {return true;}
        return false;







    }

    public static void main(String[] args) {

        System.out.println(isLeap(1900));
        System.out.println(isLeap(1992));



    }
}
