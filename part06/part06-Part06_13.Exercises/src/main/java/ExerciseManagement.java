
import java.util.ArrayList;


public class ExerciseManagement {
    
    private ArrayList<Exercise> exercises;   
    
    public ExerciseManagement() {
        this.exercises = new ArrayList<>();
    }
    
    public ArrayList<String> exerciseList() {
        ArrayList<String> exerciseNames = new ArrayList();
        
        for (Exercise exercise: this.exercises) {
            exerciseNames.add(exercise.getName());
        }
        return exerciseNames;
    }
    
    public void add(String exercise) {
        this.exercises.add(new Exercise(exercise));
    }
    
    public void markAsCompleted(String exerciseCheck) {
        for (Exercise exercise: this.exercises) {
            if (exercise.getName().equals(exerciseCheck)) {
                exercise.setCompleted();
            }
        }
    }
    
    public boolean isCompleted(String exerciseCheck) {
        for (Exercise exercise: this.exercises) {
            if (exercise.getName().equals(exerciseCheck)) {
                return exercise.isCompleted();
            }
        }
        
        return false;
    }
    

}
