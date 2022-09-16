package Kitchen;

import java.text.CollationElementIterator;
import java.util.Collections;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {


        IngredientsDataBase.start();
        RecipeDataBase.start();
        boolean cooking = true;

        System.out.println("Dobrodosli u kuhinju!");

        while (cooking) {

            System.out.println("Molimo vas izaberite neki od ponudjenih brojeva:");
            System.out.println("1. Dodavanje namirnice u frizider\n" +
                    "2. Brisanje namirnice iz frizidera\n" +
                    "3. Provera koja jela mogu da se naprave sa namirnicama iz frizidera\n" +
                    "4. Provera koja skalirana jela mogu da se naprave (skaliranje za 50%)\n" +
                    "5. Pravljenje jela\n" +
                    "6. Provera koja sve jela mogu da se naprave za X dinara\n" +
                    "7. Provera koja su sve jela X tezine recepta\n" +
                    "8. Kombinacija 6. i 7.\n" +
                    "9. Sortiranje recepata po tezini\n" +
                    "10. Sortiranje recepata po ceni\n" +
                    "11. Pogledajte omiljene recepte\n" +
                    "12. Dodajte  omiljene recepte \n" +
                    "13. Obrisite omiljene recepte\n" +
                    "14. Pogledajte omiljene recepte do X dinara\n" +
                    "15. Pogledajte sve namirnice iz frizidera\n" +
                    "16. Pogledajte sve postojece recepte \n" +
                    "0 - Izlaz iz kuhinje.");


            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();

            if (x == 15) {
                for (var y : Fridge.allIngredients) {
                    System.out.println(y.getIngredientName() + " " + y.getWeight() + " " + y.getPrice());
                }
            }
            if (x == 16) {
                for (var y : RecipeDataBase.getAllRecipes()) {
                    System.out.println(y.getRecipeName() + " " + y.getPrice() + " " + y.getLevel());
                }
            }

            if (x == 1) {
                double cena = 0;
                System.out.println("Unesite ime:");
                String ime = sc.next();
                boolean flag = false;
                for (var ingridient : Fridge.allIngredients) {
                    if (ime.equals(ingridient.getIngredientName())) {
                        flag = true;
                        cena = ingridient.getPrice();
                    }
                }

                if (!flag) {
                    System.out.println("Unesite cijenu:");
                    cena = sc.nextDouble();
                }

                System.out.println("Unesite kolicinu:");
                double kolicina = sc.nextDouble();
                WeightedIngredient i = new WeightedIngredient(ime, cena, kolicina);
                Fridge.addIngredient(i);
            }
            if (x == 2) {
                System.out.println("Unesite ime:");
                String ime = sc.next();
                int cena = 0;
                System.out.println("Unesite kolicinu:");
                double kolicina = sc.nextDouble();

                WeightedIngredient i = new WeightedIngredient(ime, cena, kolicina);
                Fridge.removeIngredient(i);
            }
            if (x == 3) {
                for (var y : RecipeDataBase.getAllRecipes()) {
                    if (Fridge.canMakeFood(y)) {
                        System.out.println(y.getRecipeName());
                    }
                }
            }

            if (x == 4) {
                Recipe temp = new Recipe();
                for (var y : RecipeDataBase.getAllRecipes()) {
                    temp = y.getScaledRecipe(50);
                    if (Fridge.canMakeFood(temp)) {
                        System.out.println(y.getRecipeName());
                    }

                }

            }

            if (x == 5) {
                System.out.println("Molimo unesite ime recepta koji zelite da napravite, ponudjeni recepti su:");
                for (var y : RecipeDataBase.getAllRecipes()) {
                    System.out.println(y.getRecipeName());
                }
                String recipeName = sc.next();
                for (var y : RecipeDataBase.getAllRecipes()) {
                    if (y.getRecipeName().equals(recipeName)) {
                        Fridge.makeFood(y);
                    }
                }
            }

            if (x == 6) {
                System.out.println("Molimo unesite cenu koju zelite:");
                double y = sc.nextDouble();
                for (var recipe : RecipeDataBase.getAllRecipes()) {
                    if (recipe.getPrice() <= y) {
                        System.out.println(recipe.getRecipeName() + " " + recipe.getPrice());
                    }
                }
            }

            if (x == 7) {
                System.out.println("Ponudjene tezine recepta su:\n" +
                        "BEGINNER (1),EASY (2),MEDIUM (3),HARD (4),PRO (5)\n" +
                        "Unesite broj pored tezine recepta:");
                int y = sc.nextInt();

                RecipeLevel level = null;
                if (y == 1) level = RecipeLevel.BEGINNER;
                if (y == 2) level = RecipeLevel.EASY;
                if (y == 3) level = RecipeLevel.MEDIUM;
                if (y == 4) level = RecipeLevel.HARD;
                if (y == 5) level = RecipeLevel.PRO;

                for (int i = 0; i < RecipeDataBase.getAllRecipes().size(); i++) {
                    if (RecipeDataBase.getAllRecipes().get(i).getLevel().compareTo(level) == 0) {
                        System.out.println(RecipeDataBase.getAllRecipes().get(i).getRecipeName() + " " + RecipeDataBase.getAllRecipes().get(i).getLevel());
                    }
                }

            }

            if (x == 8) {
                System.out.println("Molimo unesite cenu koju zelite:");
                double y = sc.nextDouble();
                System.out.println("Ponudjene tezine recepta su:\n" +
                        "BEGINNER (1),EASY (2),MEDIUM (3),HARD (4),PRO (5)\n" +
                        "Unesite broj pored tezine recepta:");
                int z = sc.nextInt();

                RecipeLevel level = null;
                if (z == 1) level = RecipeLevel.BEGINNER;
                if (z == 2) level = RecipeLevel.EASY;
                if (z == 3) level = RecipeLevel.MEDIUM;
                if (z == 4) level = RecipeLevel.HARD;
                if (z == 5) level = RecipeLevel.PRO;
                for (var recipe : RecipeDataBase.getAllRecipes()) {
                    if (recipe.getPrice() <= y && recipe.getLevel().compareTo(level) == 0) {
                        System.out.println(recipe.getRecipeName() + " " + recipe.getPrice() + " " + recipe.getLevel());

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
                }
                for (var y : RecipeDataBase.getAllRecipes()) {
                    System.out.println(y.getRecipeName() + " " + y.getLevel());
                }
            }


            if (x == 10) {
                for (int i = 0; i < RecipeDataBase.getAllRecipes().size(); i++) {
                    for (int j = 0; j < RecipeDataBase.getAllRecipes().size() - i - 1; j++) {
                        if (RecipeDataBase.getAllRecipes().get(j).getPrice() > RecipeDataBase.getAllRecipes().get(j + 1).getPrice()) {
                            Recipe temp = RecipeDataBase.getAllRecipes().get(j);
                            RecipeDataBase.getAllRecipes().set(j, RecipeDataBase.getAllRecipes().get(j + 1));
                            RecipeDataBase.getAllRecipes().set(j + 1, temp);
                        }
                    }
                }
                for (var y : RecipeDataBase.getAllRecipes()) {
                    System.out.println(y.getRecipeName() + " " + y.getPrice());


                }
            }
            if (x == 11) {
                for (var y : RecipeDataBase.getFavoriteRecipes()) {
                    System.out.println(y.getRecipeName());
                }
            }

            if (x == 12) {

                System.out.println("Postojeci recepti su:");
                for (var y : RecipeDataBase.getAllRecipes()) {
                    if (!RecipeDataBase.getFavoriteRecipes().contains(y))
                        System.out.println(y.getRecipeName());
                }

                System.out.println("Koji recept zelite da dodate u omiljene recepte:");
                String z = sc.next();
                for (var y : RecipeDataBase.getAllRecipes()) {
                    if (z.equals(y.getRecipeName()) && !RecipeDataBase.getFavoriteRecipes().contains(y)) {
                        RecipeDataBase.getFavoriteRecipes().add(y);
                    }
                }

            }

            if (x == 13) {
                System.out.println("Omiljeni recepti su:");
                for (var y : RecipeDataBase.getFavoriteRecipes()) {
                    System.out.println(y.getRecipeName());
                }
                System.out.println("Koji recept zelite da uklonite:");
                String z = sc.next();
                Recipe recept = null;
                for (var y : RecipeDataBase.getFavoriteRecipes()) {
                    if (z.equals(y.getRecipeName()) && RecipeDataBase.getFavoriteRecipes().contains(y)) {
                        recept = y;
                        break;
                    }
                }
                RecipeDataBase.getFavoriteRecipes().remove(recept);
            }

            if (x == 14) {
                System.out.println("Unesite cenu do koje zelite da pogledate omiljene recepte:");
                double z = sc.nextDouble();

                for (var y : RecipeDataBase.getFavoriteRecipes()) {
                    if (y.getPrice() <= z) {
                        System.out.println(y.getRecipeName() + " " + y.getPrice());
                    }

                }
            }


            if (x == 0) {
                cooking = false;
            }
        }
    }
}




