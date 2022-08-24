package Domaci3;

public class Zadatak3 {

    public static boolean isArmstrong(int num)
    {
        int counter = 0;
        int temp = num;
        while(temp>0)
        {
            temp /= 10;
            counter++;
        }
        temp = num;
        int digit = 0;
        int sum = 0;
        while(temp > 0)
        {
            digit = temp % 10;
            sum += (int)Math.pow(digit, counter);
            temp /= 10;
        }
        if (sum == num) return true;
        else return false;
    }

    public static void main(String[] args) {

        System.out.println(isArmstrong(371));
        System.out.println(isArmstrong(5));
        System.out.println(isArmstrong(1634));
        System.out.println(isArmstrong(1625));
    }
}
