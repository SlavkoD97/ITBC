package Kitchen;

import java.text.CollationElementIterator;
import java.util.Collections;
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

        if (x == 9) {
            System.out.println("Pritisnite 1 za sortiranje od lakseg ka tezem.");
            System.out.println("Pritisnite 2 za sortiranje od tezeg ka laksem.");
            int z = sc.nextInt();
            if (z == 1) {
                for (int i = 0; i < RecipeDataBase.getAllRecipes().size(); i++) {
                    for (int j = 0; j < RecipeDataBase.getAllRecipes().size() - i - 1; j++) {
                        if (RecipeDataBase.getAllRecipes().get(j).getLevel().compareTo(RecipeDataBase.getAllRecipes().get(j + 1).getLevel()) > 0) {
                            Recipe temp = RecipeDataBase.getAllRecipes().get(j);
                            RecipeDataBase.getAllRecipes().set(j, RecipeDataBase.getAllRecipes().get(j + 1));
                            RecipeDataBase.getAllRecipes().set(j + 1, temp);

                        }
                    }
                }

            }
            if (z == 2) {
                for (int i = 0; i < RecipeDataBase.getAllRecipes().size(); i++) {
                    for (int j = 0; j < RecipeDataBase.getAllRecipes().size() - i - 1; j++) {
                        if (RecipeDataBase.getAllRecipes().get(j).getLevel().compareTo(RecipeDataBase.getAllRecipes().get(j + 1).getLevel()) < 0) {
                            Recipe temp = RecipeDataBase.getAllRecipes().get(j);
                            RecipeDataBase.getAllRecipes().set(j, RecipeDataBase.getAllRecipes().get(j + 1));
                            RecipeDataBase.getAllRecipes().set(j + 1, temp);
                        }

                    }
                }
            } for (var y : RecipeDataBase.getAllRecipes()) {
                System.out.println(y.getRecipeName() + " " + y.getLevel());
            }
        }

        if (x == 10) {

        }
    }
}
