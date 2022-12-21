/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nicholas
 */
public class Timer {
    
    private ClockHand second;
    private ClockHand hundredth;
    
    public Timer() {
        this.second = new ClockHand(60);
        this.hundredth = new ClockHand(100);
    }
    
    public void advance() {
        this.hundredth.advance();
        
        if (this.hundredth.value() == 0) {
            this.second.advance();
        }
        
    }
    
    @Override
    public String toString() {
        return this.second.toString() + ":" + this.hundredth.toString();
    }
    
}
