
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nicholas
 */
public class GradeUI {
    
    public static void start(Scanner scan) {
        
        GradeBook gradeBook = new GradeBook();
        
        //
        System.out.println("Enter point totals, -1 stops:");
        while (true) {
            int input = Integer.valueOf(scan.nextLine());
            
            // Exit if input is -1
            if (input == -1) {
             break;
            }
            
            // Work only on valid range input >= 0 and <= 100
            if (GradeUI.isValidInput(input)) {
                gradeBook.addPoint(input);
            }
            
        }
        // Printing results
        printAveragePoints(gradeBook.getPointsAverage());
        printAveragePointsPassing(gradeBook.getPassingPointsAverage());
        printPassPercentage(gradeBook.getPassPercentage());
        printGradesDistribution(gradeBook.getGradesDistribution());
        
    }
    
    private static boolean isValidInput(int input) {
        return input >= 0 && input <= 100;
    }
    
    private static void printAveragePoints(double average) {
        System.out.println("Point average (all): " + average);
    }
    
    private static void printAveragePointsPassing(double average) {
        
        if (average > 0) {
            System.out.println("Point average (passing): " + average);
        } else {
            System.out.println("Point average (passing): -");
        }
    }
    
    private static void printPassPercentage(double percentage) {
        System.out.println("Pass percentage: " + percentage);
    }
    
    private static void printGradesDistribution(String[] grades) {
        System.out.println("Grade distribution:");
        for (int i = grades.length - 1; i >= 0; i--) {
            System.out.println(i + ":" + grades[i]);
        }
    }
    
}
