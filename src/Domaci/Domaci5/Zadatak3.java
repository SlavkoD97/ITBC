package Domaci5;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Zadatak3 {

    public static String random (ArrayList<String>list){

        Random rand = new Random();

        int x = rand.nextInt(list.size());




       return list.get(x); }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> lista = new ArrayList<String>();

         while (true) {
            System.out.println("Molimo unesite element niza (za prestanak napisite stop)");
            String x = sc.nextLine();
            if (x.equals("stop"))  {
                break;
            }

            lista.add(x);

        }
        System.out.println(lista);
        System.out.println(random(lista));
    }
}
