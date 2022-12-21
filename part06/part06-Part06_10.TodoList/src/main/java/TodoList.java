
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
public class TodoList {
    
    private ArrayList<String> tasks;
    
    public TodoList() {
        this.tasks =new ArrayList();
    }
    
    public void add(String task) {
        this.tasks.add(task);
    }
    
    public void remove(int number) {
        
        // Convert number to programming counting
        number -= 1;
        
        this.tasks.remove(number);
    }
    
    public void print() {
        for (String task: tasks) {
            // convert to human counting
            int taskNumber = tasks.indexOf(task) + 1;
            System.out.println(taskNumber + ": " + task);
        }
    }
    
}
