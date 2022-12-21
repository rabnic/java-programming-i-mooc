
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
public class Suitcase {
    
    private int maxWeight;
    private ArrayList<Item> items;
    private int totalWeight;
    
    public Suitcase(int weightLimit) {
        this.maxWeight = weightLimit;
        this.items = new ArrayList();
        this.totalWeight = 0;
    }
    
    public void addItem(Item item) {
        if (this.totalWeight + item.getWeight() > this.maxWeight) {
            return;
        }
        
        this.items.add(item);
        this.totalWeight += item.getWeight();
    }
    
    public int totalWeight() {
        return this.totalWeight;
    }
    
    public void printItems() {
        for(Item item: this.items) {
            System.out.println(item);
        }
    }
    
    public Item heaviestItem() {
        if(this.items.isEmpty()) {
            return null;
        }
        
        Item heavy = this.items.get(0);
        for(Item item: this.items) {
            if(heavy.getWeight() < item.getWeight()) {
                heavy = item;
            }
        }
        
        return heavy;
    }
    
    public String toString() {
        
        if (this.items.size() == 1) {     
            return this.items.size() + " item (" + this.totalWeight +" kg)";
        } else {
            String howMany = Integer.toString(this.items.size());
            if (this.items.size() < 1) {
                howMany = "no";
            }
            return howMany + " items (" + this.totalWeight +" kg)";
        }
        
    }
    
}
