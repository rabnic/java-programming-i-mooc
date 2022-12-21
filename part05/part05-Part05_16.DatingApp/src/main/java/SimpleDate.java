
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month &&
                 this.day < compared.day) {
            return true;
        }

        return false;
    }
    
    public void advance(int howManyDays) {
        int daysLimit = 30;
        int monthsLimit = 12;
        
        this.day += howManyDays;
        
        if (this.day > daysLimit) {
            // months made up from total days
            this.month += Math.floorDiv(this.day, daysLimit);
            // remaining days not making a full month
            this.day = this.day % daysLimit;
            
            // 
            if (this.month > monthsLimit) {
                // years made up from total months
                this.year += Math.floorDiv(this.month, monthsLimit);
                // remaining months not making a full year
                this.month = this.month % monthsLimit;
            } 
        }     
    }
    
    public void advance() {
        this.advance(1);
    }
    
    public SimpleDate afterNumberOfDays(int days) {
        SimpleDate newDate = new SimpleDate(this.day, this.month, this.year);
        // Increment date by given days and return date
        newDate.advance(days);
        return newDate;
    }

}
