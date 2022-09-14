package Kitchen;

import java.util.ArrayList;

public class RecipeDataBase {

    private static ArrayList<Recipe> allRecipes = new ArrayList<>();

    private static ArrayList<Recipe> favoriteRecipes = new ArrayList<>();

    public static void addFavRecipe (Recipe recipe) {favoriteRecipes.add(recipe);}

    public static void removeFavRecipe (Recipe recipe) {favoriteRecipes.remove(recipe);}

    public static ArrayList<Recipe> getFavoriteRecipes() {
        return favoriteRecipes;
    }

    public static void addRecipe (Recipe recipe){
        allRecipes.add(recipe);
    }

    public static ArrayList<Recipe> getAllRecipes() {
        return allRecipes;
    }

    public static void start() {
       Recipe r1 = new Recipe("r1", RecipeLevel.EASY);
       Recipe r2 = new Recipe("r2", RecipeLevel.BEGINNER);
       Recipe r3 = new Recipe("r3", RecipeLevel.HARD);
       Recipe r4 = new Recipe("r4", RecipeLevel.PRO);
       Recipe r5 = new Recipe("r5", RecipeLevel.MEDIUM);
       Recipe r6 = new Recipe("r6", RecipeLevel.BEGINNER);
       Recipe r7 = new Recipe("r7", RecipeLevel.HARD);
       Recipe r8 = new Recipe("r8", RecipeLevel.MEDIUM);
       Recipe r9 = new Recipe("r9", RecipeLevel.EASY);
       Recipe r10 = new Recipe("r10", RecipeLevel.BEGINNER);



        RecipeDataBase.addRecipe(r1);
        RecipeDataBase.addRecipe(r2);
        RecipeDataBase.addRecipe(r3);
        RecipeDataBase.addRecipe(r4);
        RecipeDataBase.addRecipe(r5);
        RecipeDataBase.addRecipe(r6);
        RecipeDataBase.addRecipe(r7);
        RecipeDataBase.addRecipe(r8);
        RecipeDataBase.addRecipe(r9);
        RecipeDataBase.addRecipe(r10);

        r1.addIngredient(Fridge.getAllIngredients().get(0));
        r1.addIngredient(Fridge.getAllIngredients().get(0));
        r1.addIngredient(Fridge.getAllIngredients().get(0));
        r1.addIngredient(Fridge.getAllIngredients().get(1));
        r1.addIngredient(Fridge.getAllIngredients().get(2));

        r2.addIngredient(Fridge.getAllIngredients().get(5));



        r3.addIngredient(Fridge.getAllIngredients().get(7));
        r3.addIngredient(Fridge.getAllIngredients().get(8));

        r4.addIngredient(Fridge.getAllIngredients().get(9));
        r4.addIngredient(Fridge.getAllIngredients().get(9));
        r4.addIngredient(Fridge.getAllIngredients().get(9));
        r4.addIngredient(Fridge.getAllIngredients().get(9));

        RecipeDataBase.addFavRecipe(r1);



   }
}
