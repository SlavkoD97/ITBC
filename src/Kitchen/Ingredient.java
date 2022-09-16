package Kitchen;

public abstract class Ingredient implements Priceable{

    private int id;
    private static int counter = 0;
    private String ingredientName;

    double price;


    public Ingredient(String ingredientName, double price) {
        this.ingredientName = ingredientName;
        this.price = price;
        id = counter;
        counter++;
    }

    public int getId() {
        return id;
    }


    public String getIngredientName() {
        return ingredientName;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
