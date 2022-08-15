package Domaci3;

public class Zadatak2 {

    public static boolean isArmstrong(int num) {

        int stotina = num / 100;
        int desetica = (num % 100) / 10;
        int jedinica = (num % 10);


        if (num == Math.pow(stotina, 3) + Math.pow(desetica, 3) + Math.pow(jedinica, 3)) {
            return true;
        }
        return false;
    }



    public static void main(String[] args) {

        System.out.println(isArmstrong(371));
        System.out.println(isArmstrong(372));
        System.out.println(isArmstrong(373));
    }
}
