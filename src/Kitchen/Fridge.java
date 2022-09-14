package Kitchen;

import java.util.ArrayList;
import java.util.Scanner;

public class Fridge {

    static ArrayList<WeightedIngredient> allIngredients = new ArrayList<>();

    public static void addIngredient(WeightedIngredient ingredient) {
        for (var x : allIngredients) {
            if (x.getIngredientName().equals(ingredient.getIngredientName())) {
                x.setWeight(x.getWeight() + ingredient.getWeight());
                return;
            }
        }
        allIngredients.add(ingredient);
    }




    public static void removeIngredient(WeightedIngredient ingredient) {

        boolean flag = false;
        for (int j = 0; j < allIngredients.size(); j++) {
            if (allIngredients.get(j).getIngredientName().equals(ingredient.getIngredientName())) {
                flag = true;
                break;
            }
        }
        if (flag) {

            for (var x : allIngredients) {
                if (ingredient.getIngredientName().equals(x.getIngredientName())) {
                    if (x.getWeight() - ingredient.getWeight() > 0) {
                        x.setWeight(x.getWeight() - ingredient.getWeight());
                        break;

                    } else {
                        allIngredients.remove(x);
                        break;
                    }
                }
            }
        } else {
            System.out.println("Nemate tu stvar u frizideru.");;
        }


    }

    public static boolean canMakeFood(Recipe recipe) {
        boolean flag = false;
        for (int i = 0; i < recipe.getRecipe().size(); i++) {
            flag = false;
            WeightedIngredient temp = recipe.getRecipe().get(i);
            for (int j = 0; j < allIngredients.size(); j++) {
                if (allIngredients.get(j).getIngredientName().equals(temp.getIngredientName()) && allIngredients.get(j).getWeight() >= temp.getWeight()) {
                    flag = true;
                }

            }
            if (!flag) {
                System.out.println("Nije moguce napraviti");
                return false;
            }
        }
        return true;

    }


    public static void makeFood(Recipe recipe) {
        if (canMakeFood(recipe)) {
            for (var x : recipe.getRecipe()) {
                for (int i = 0; i < allIngredients.size(); i++) {
                    if (allIngredients.get(i).getIngredientName().equals(x.getIngredientName())) {
                        allIngredients.get(i).setWeight(allIngredients.get(i).getWeight() - x.getWeight());
                    }
                }
            }

        }

    }


    public static ArrayList<WeightedIngredient> getAllIngredients() {
        return allIngredients;
    }
}




