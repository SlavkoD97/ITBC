package Domaci6;

import java.util.*;

public class Zadatak3a {

    //Druga verzija zadatka, sa uvodjenjem vise zagrada:


    public static boolean isValid(String str) {

        boolean valid = true;
        String counter = "1";

        Stack <String> stek = new Stack<>();

        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == '('){
                stek.push(counter);
            }
            if (str.charAt(i)== ')'){
                if (stek.isEmpty()){return false;}
                stek.pop();
            }

            }
        if (stek.isEmpty())return true;


        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == '['){
                stek.push(counter);
            }
            if (str.charAt(i)== ']'){
                if (stek.isEmpty()){return false;}
                stek.pop();
            }

        }
        if (stek.isEmpty())return true;

        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == '{'){
                stek.push(counter);
            }
            if (str.charAt(i)== '}'){
                if (stek.isEmpty()){return false;}
                stek.pop();
            }

        }
        if (stek.isEmpty())return true;
        return false;
    }





    public static void main(String[] args) {
        System.out.println(isValid("()()()"));
        System.out.println(isValid(")()("));
        System.out.println(isValid("(()(()"));
        System.out.println(isValid("((()()))"));

        System.out.println("------------------------");

        System.out.println(isValid("[{}({})]"));
        System.out.println(isValid("[{})]"));
        System.out.println(isValid("{()[({})]}"));

    }

}

