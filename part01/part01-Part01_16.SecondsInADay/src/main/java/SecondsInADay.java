
import java.util.Scanner;

public class SecondsInADay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        int secondsInMinute = 60;
        int minutesInHour = 60;
        int hoursInDay = 24;
        
        System.out.println("How many days would you like to convert to seconds?");
        int daysToSeconds = Integer.valueOf(scanner.nextLine());
        int totalSeconds = (secondsInMinute * minutesInHour * hoursInDay) * daysToSeconds;
        System.out.println(totalSeconds);

    }
}
