
public class Statistics {
    
    private int count;
    private int sum;
    
    public Statistics() {
        this.count = 0;
        this.sum = 0;
    }
    
    public void addNumber(int number) {
        // Add number
        this.sum += number;
        
        // Increment the count of numbers added;
        this.count += 1;
    }
    
    public int getCount() {
        return this.count;
    }
    
    public int sum() {
        return this.sum;
    }
    
    public double average() {
        
        if (this.count == 0) {
            return 0;
        }
        return 1.0 * sum / count;
    }
}
