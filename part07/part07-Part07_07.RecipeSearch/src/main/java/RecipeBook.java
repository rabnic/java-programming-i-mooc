
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nicholas
 */
public class RecipeBook {
    
    private ArrayList<Recipe> recipes;
    
    public RecipeBook() {
        this.recipes = new ArrayList();
    }
    
    public void addRecipe(Recipe recipe) {
        this.recipes.add(recipe);
    }
    
    public ArrayList<Recipe> getRecipes() {
        return this.recipes;
    }
    
    public String toString() {
        return this.recipes.size() + " recipes added";
    }
    
    public ArrayList<Recipe> searchByName(String name) {
        ArrayList<Recipe> matchedRecipes = new ArrayList();
        for (Recipe recipe: this.recipes) {
            if (recipe.getName().contains(name)) {
                matchedRecipes.add(recipe);
            }
        }
        return matchedRecipes;
    }
    
    public ArrayList<Recipe> searchByDuration(int time) {
        ArrayList<Recipe> matchedRecipes = new ArrayList();
        for (Recipe recipe: this.recipes) {
            if (recipe.getDuration() <= time) {
                matchedRecipes.add(recipe);
            }
        }
        return matchedRecipes;
    }
    
    public ArrayList<Recipe> searchByIngredient(String name) {
        ArrayList<Recipe> matchedRecipes = new ArrayList();
        for (Recipe recipe: this.recipes) {
            for (String ingredient: recipe.getIngredients()) {
                if (ingredient.equals(name)) {
                    matchedRecipes.add(recipe);
                    continue;
                }
            }
        }
        return matchedRecipes;
    }
    
    
    
}
