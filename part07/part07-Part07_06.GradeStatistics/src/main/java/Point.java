/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nicholas
 */
public class Point {
    
    private int value;
    
    public Point(int val) {
        this.value = val;
    }
    
    public int getPoint() {
        return this.value;
    }
    
    
    @Override
    public String toString() {
        return this.value + "";
    }
    
}
