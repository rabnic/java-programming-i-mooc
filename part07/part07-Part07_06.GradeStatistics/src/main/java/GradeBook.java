
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
public class GradeBook {
    
    private ArrayList<Point> points;
    private String[] grades;
    private int totalPoints;
    private int totalPassingPoints;
    private int countPassingPoints;
   
    
    public GradeBook() {
        this.points = new ArrayList();
        this.countPassingPoints = 0;
        this.totalPassingPoints = 0;
        this.totalPoints = 0;
        this.grades = new String[] {"","","","","",""};
    
    }
    
    public void addPoint(int value) {
        this.points.add(new Point(value));
        sumTotalPoints(value);
        sumTotalPassingPoints(value);
    }
    
    private void sumTotalPoints(int value) {
        this.totalPoints += value;
    }
    
    private void sumTotalPassingPoints(int value) {
        if (value >= 50) {
            this.totalPassingPoints += value;
            this.countPassingPoints++;
        }
    }
    
    public double getPointsAverage() {
        return 1.0  * this.totalPoints / this.points.size();
    
    }
    
    public double getPassingPointsAverage() {
        if (this.countPassingPoints == 0) {
            return 0;
        }
        return 1.0  * this.totalPassingPoints / this.countPassingPoints;
    
    }
    
    public double getPassPercentage() {
        return 100.0 * this.countPassingPoints / this.points.size();
    }
    
    private int pointToGrade(int point) {
        if (point < 50) {
            return 0;
        } else if ( point < 60) {
            return 1;
        } else if (point < 70) {
            return 2;
        } else if (point < 80) {
            return 3;
        } else if (point < 90) {
            return 4;
        } else {
            return 5;
        }
    }
    
    public String[] getGradesDistribution() {
        for (Point point: this.points) {
            this.grades[this.pointToGrade(point.getPoint())] += "*";
            //System.out.println(this.pointToGrade(point.getPoint()) +" === "+ point.getPoint());
        }
        return this.grades;
    }
    
}
