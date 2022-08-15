package Domaci3;

public class Zadatak5 {

    //https://www.codewars.com/kata/5effa412233ac3002a9e471d/java

    public static int sum(int num1, int num2) {
        int rez = 0;
        int a, b;
        int counter = 0;
        int temp = 0;
        while (num1 > 0 || num2 > 0) {
            a = num1 % 10;
            b = num2 % 10;
            temp = a + b;

            rez = temp * (int) Math.pow(10, counter) + rez;
            if (temp > 10)
                counter++;
            counter++;
            num1 /= 10;
            num2 /= 10;
        }
        return rez;
    }

    public static void main(String[] args) {

        System.out.println(sum(16,18));

        System.out.println(sum(248,208));
    }
}

