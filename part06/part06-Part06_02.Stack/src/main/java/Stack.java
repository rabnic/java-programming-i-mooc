
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
public class Stack {
    
    ArrayList<String> list;
    
    public Stack() {
        this.list = new ArrayList();
    }
    
    public void add(String item) {
        if (!(list.contains(item))) {
            list.add(item);
        }
    }
    
    public boolean isEmpty() {
        return list.isEmpty();
    }
    
    public ArrayList<String> values() {
        return list;
    }
    
    public String take() {
        String taken = list.get(list.size() - 1);
        list.remove(list.size() - 1);
        return taken;
    }
    
    
    
}
