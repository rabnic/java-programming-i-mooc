/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nicholas
 */
public class Counter {
    
    private int value;
    
    public Counter(int value) {
        this.value = value;
    }
    
    public Counter() {
        this(0);
    }
    
    public int value() {
        return this.value;
    }
    
    public void increase() {
        this.increase(1);
    }
    
    public void increase(int value) {
        if (value >= 0) {
            this.value += value;
        }
    }
    
    public void decrease() {
        this.decrease(1);
    }
    
    public void decrease(int value) {
        if (value >= 0) {
            this.value -= value;
        }
    }
}
