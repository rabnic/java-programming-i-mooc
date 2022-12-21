/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nicholas
 */
public class Exercise {
    
    private String name;
    private boolean isCompleted;
    
    public Exercise(String name) {
        this.name = name;
        this.isCompleted = false;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setCompleted() {
        this.isCompleted = true;
    }
    
    public boolean isCompleted() {
        return this.isCompleted;
    }
}
