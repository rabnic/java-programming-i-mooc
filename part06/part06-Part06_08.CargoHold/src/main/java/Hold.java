
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
public class Hold {
    
    private int maxWeight;
    private ArrayList<Suitcase> cases;
    private int totalWeight;
    
    public Hold(int weightLimit) {
        this.maxWeight = weightLimit;
        this.cases = new ArrayList();
        this.totalWeight = 0;
    }
    
    public void addSuitcase(Suitcase suitcase) {
        if (this.totalWeight + suitcase.totalWeight() > this.maxWeight) {
            return;
        }
        
        this.cases.add(suitcase);
        this.totalWeight += suitcase.totalWeight();
    }
    
    public int totalWeight() {
        return this.totalWeight;
    }
   
    public String toString() {
        
        if (this.cases.size() == 1) {     
            return this.cases.size() + " suitcase (" + this.totalWeight +" kg)";
        } else {
            String howMany = Integer.toString(this.cases.size());
            if (this.cases.size() < 1) {
                howMany = "no";
            }
            return howMany + " suitcases (" + this.totalWeight +" kg)";
        }
        
    }
    
    public void printItems() {
        for(Suitcase suitcase: this.cases) {
            suitcase.printItems();
        }
    }
}
