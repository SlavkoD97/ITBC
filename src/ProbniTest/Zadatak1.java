package ProbniTest;

public class Zadatak1 {
    public static int factorial(int number){
      /*  int f = 1;
        for (int i = 1; i <= number; i++){

            f = f * i;
        }


        return f;
*/
        if(number == 1) return 1;
        else return number * factorial((number-1));
        }

    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(factorial(10));
    }
    }

