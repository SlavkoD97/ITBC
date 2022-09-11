package Kitchen;

import java.util.ArrayList;

public class WeightedIngredient extends Ingredient{

    private int id;
    private static int counter = 0;
    private double weight;




    public WeightedIngredient(String ingredientName, double price, double weight) {
        super(ingredientName, price);
        this.weight = weight;
        id = counter;
        counter++;

    }

    @Override
    public int getId() {
        return id;
    }

    public double getWeight() {
        return weight;
    }



    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public double getPrice() {
        return weight * price;
    }

    
}
