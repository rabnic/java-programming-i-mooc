/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nicholas
 */
public class Item {
    
    private String identifier;
    private String name;
    
    public Item(String id, String name) {
        this.identifier = id;
        this.name = name;
    }
    
    public String getIdentifier() {
        return this.identifier;
    }
    
    public String getName() {
        return this.name;
    }
    
    public String toString() {
        return this.identifier + ": " + this.name;
    }
    
    public boolean equals(Object compared) {
        //return true if objects are at the same location
        if (this == compared) {
            return true;
        }
        
        // return false objects are not of the same type
        if (!(compared instanceof Item)) {
            return false;
        }
        
        // convert compared to Item type
        Item comparedItem = (Item) compared;
        
        // compared identifier and if identical then return true
        if (this.identifier.equals(comparedItem.identifier)) {
            return true;
        }
        
        // or just return false
        return false;
    }
    
}
