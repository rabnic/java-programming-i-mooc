
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nicholas
 */
public class RecipeUI {
    
    public static void start(Scanner scanner, String file) {
        RecipeBook recipeBook = new RecipeBook();
        //Scanner scanner = new Scanner(System.in);
        //
        readFromFile(recipeBook, file);
        
        //
        printCommands();
        
        while(true) {
            //System.out.println("");
            System.out.print("Enter command:");
            String command = scanner.nextLine();
            System.out.println("");
            
            if (command.equals("stop")) {
                break;
            }
            
            if (command.equals("list")) {
                printRecipes(recipeBook.getRecipes());
                 
            }
            
            if (command.equals("find name")) {
                System.out.print("Searched word: ");
                String name = scanner.nextLine();
                printRecipes(recipeBook.searchByName(name));
            }
            
            if (command.equals("find cooking time")){
                System.out.print("Max cooking time: ");
                int cookingTime = Integer.valueOf(scanner.nextLine());
                printRecipes(recipeBook.searchByDuration(cookingTime));
            }
            
            if (command.equals("find ingredient")) {
                System.out.print("Ingredient: ");
                String ingredient = scanner.nextLine();                
                printRecipes(recipeBook.searchByIngredient(ingredient));
            }
            
        }
        
    }
    
    private static String readRecipeName(Scanner scan) {
        return scan.nextLine();
    }
    
    private static int readRecipeDuration(Scanner scan) {
        return Integer.valueOf(scan.nextLine());
    }
    
    private static void readRecipeIngredients(Recipe recipe,Scanner scan) {
  
        String ingredient = "";
        while(scan.hasNextLine()) {
            ingredient = scan.nextLine();
            if (ingredient.isEmpty()) {
                break;
            }
            recipe.addIngredients(ingredient);
        }
    }
    
    private static void readFromFile(RecipeBook recipeBook, String file) {
        try (Scanner scanner = new Scanner(Paths.get(file))) {
            // While there is more to read, continue reading
            while(scanner.hasNextLine()) {
                // read name
                String name = readRecipeName(scanner);
                
                // read cooking time
                int cookingTime = readRecipeDuration(scanner);
                
                // Instantiate a new Recipe object
                Recipe recipe = new Recipe(name, cookingTime);
                
                // read ingredients and add to recipe object until black line
                readRecipeIngredients(recipe, scanner);
                
                // add the read recipe to recipebook
                recipeBook.addRecipe(recipe);
            }
        
        } catch (Exception e) {
            //System.out.println("Error: " + 
                    e.printStackTrace();
        }
    }
    
    private static void printRecipes(ArrayList<Recipe> recipes) {
        System.out.println("");
        System.out.println("Recipes:");
        for(Recipe recipe: recipes) {
            System.out.println(recipe);
        }
    }
    
    private static void printCommands() {
        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
    }
    
}
