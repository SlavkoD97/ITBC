package Kitchen;

import java.util.ArrayList;

import java.util.*;

public class Recipe implements Priceable {

    private String recipeName;

    private double price;

    private ArrayList<WeightedIngredient> recipe;





    RecipeLevel level;




    public Recipe(String recipeName, RecipeLevel level) {
        this.recipeName = recipeName;
        this.level = level;
        recipe = new ArrayList<WeightedIngredient>();
        price = 0;

    }

    public Recipe() {
        recipe = new ArrayList<>();


    }

    public String getRecipeName() {
        return recipeName;
    }

    public ArrayList<WeightedIngredient> getRecipe() {
        return recipe;
    }

    public void addIngredient(WeightedIngredient ingredient) {
        boolean flag = false;
        for(int j = 0; j < recipe.size(); j++) {
            if(recipe.get(j).getIngredientName().equals(ingredient.getIngredientName())){
                flag = true;
            }
        }
        if (!flag){
            WeightedIngredient temp = new WeightedIngredient(ingredient.getIngredientName(), ingredient.getPrice(), ingredient.getWeight());

        recipe.add(temp);}
        else {
            for (int i = 0; i < recipe.size(); i++){
                //recipe.get(i).setWeight(recipe.get(i).getWeight() + ingredient.getWeight());
                if(recipe.get(i).getIngredientName().equals(ingredient.getIngredientName())) {
                    recipe.get(i).setWeight(recipe.get(i).getWeight() + ingredient.getWeight());
                }
            }
        }
    }

    public RecipeLevel getLevel() {
        return level;
    }

    public Recipe getScaledRecipe (double scale) {

        Recipe retVal = new Recipe();
        int p = (int) (100 / scale);

        for (int i = 0; i < recipe.size(); i++) {
            WeightedIngredient temp = new WeightedIngredient(recipe.get(i).getIngredientName(), 0, 0);
            temp.setWeight(recipe.get(i).getWeight() / p);

            retVal.addIngredient(temp);
        }

        return retVal;
    }


    public void removeIngredient(WeightedIngredient ingredient) {
        if (recipe.contains(ingredient)) {
            recipe.remove(ingredient);
        }
    }


    @Override
    public double getPrice() {
        price = 0;
        for (var x : recipe){
            price = price + x.getPrice();
        }
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


}


