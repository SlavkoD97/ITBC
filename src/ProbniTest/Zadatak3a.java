package ProbniTest;

public class Zadatak3a{

    public static void sema(int W, int H) {

        int N = 0;
        if (H % 2 == 0){N = (H - 2) / 2 - 1 ;}
        else {N = (H - 2) / 2 ;}


        System.out.println(" " + "#".repeat(W - 2));

        for (int i = 1; i < (H - 2) ; i++) {
            System.out.println("#" + " ".repeat(W - 2) + "#");
            if (i == N){
                System.out.println(" " + "#".repeat(W - 2));}
            }
        if (H > 1)
        System.out.println(" " + "#".repeat(W - 2));
        System.out.println(" ");
    }

    public static void main(String[] args) {

        sema(5,7);
        sema(5,8);
        sema(5,1);






    }
}



