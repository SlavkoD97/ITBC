package ProbniTest;

public class Zadatak2 {
    public static void piramida(int number) {
        System.out.println(" ".repeat((number + 1)) + "*");

        for (int i = 0; i < number - 1; i++){
            System.out.println(" ".repeat(number - i) + "*" + " ".repeat(i) + "*" + " ".repeat(i) + "*");
        }



        }




    public static void main(String[] args) {
        piramida(10);
    }
}

