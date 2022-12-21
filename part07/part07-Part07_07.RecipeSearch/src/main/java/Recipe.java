
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
public class Recipe {
    
    private String name;
    private int duration;
    private ArrayList<String> ingredients;
    
    public Recipe(String name, int cookingTime) {
        this.name = name;
        this.duration = cookingTime;
        this.ingredients = new ArrayList();
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getDuration() {
        return this.duration;
    }
    
    public void addIngredients(String ingred) {
        this.ingredients.add(ingred);
    }
    
    public ArrayList<String> getIngredients() {
        return this.ingredients;
    }
    
    public String toString() {
        return this.name + ", cooking time: " + this.duration;
    }
    
}
