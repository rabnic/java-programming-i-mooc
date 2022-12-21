
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
public class BirdDatabase {
    
    private ArrayList<Bird> birds;
    
    public BirdDatabase() {
        this.birds = new ArrayList();
    }
    
    public void add(Bird bird) {
        this.birds.add(bird);
    }
    
    public Bird getBird(String name) {
        for (Bird bird: this.birds) {
            if(bird.getName().equals(name)) {
                return bird;
            }
        }
        
        return null;
    }
    
    public ArrayList<Bird> getAll() {
        return this.birds;
    }
    
    public boolean isObservedSuccess(String name) {
        if (getBird(name) != null) {
            getBird(name).observe();
            return true;
        }
        
        return false;
    }
    
}
