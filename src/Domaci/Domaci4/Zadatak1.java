package Domaci4;

public class Zadatak1 {

    public static String reverse (String sentence){

        String reverseSentence = "";
        for (int i = sentence.length() - 1; i >= 0; i--){
            reverseSentence = reverseSentence + sentence.charAt(i);}
        return reverseSentence;




    }
    public static void main(String[] args) {

        System.out.println(reverse("This is Sparta!."));
        System.out.println(reverse("Ovaj program radi."));



    }
}
