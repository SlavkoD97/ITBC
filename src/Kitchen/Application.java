package Kitchen;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {


        IngredientsDataBase.start();
        RecipeDataBase.start();

        System.out.println("Dobrodosli u kuhinju!");
        System.out.println("Molimo vas izaberite neki od ponudjenih brojeva:");

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        if (x == 1){
            System.out.println("Unesite ime:");
            String ime = sc.nextLine();
            System.out.println("Unesite cijenu:");
            double cena = sc.nextDouble();
            System.out.println("Unesite kolicinu:");
            double kolicina = sc.nextDouble();
            WeightedIngredient i = new WeightedIngredient(ime, cena, kolicina);
            Fridge.addIngredient(i);
        }
        if (x == 2){
            WeightedIngredient i = new WeightedIngredient(sc.nextLine(), sc.nextDouble(), sc.nextDouble());
            Fridge.removeIngredient(i);
        }
        if (x == 3) {
            for (var y : RecipeDataBase.getAllRecipes()){
                if (Fridge.canMakeFood(y)){
                    System.out.println(y.getRecipeName());
                }
            }
        }

        if (x == 4) {
            double y = sc.nextDouble();
            if (y <= 0){
                System.out.println(y);}

        }

        if (x == 5) {

        }
    }
}
