import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Before;
import org.junit.Test;



public class ExerciseManagementTest {
    private ExerciseManagement management;
    
    @Before    
    public void initialize() {
        management = new ExerciseManagement();
    }
    
    @Test
    public void exerciseListEmptyAtBeginning() {
        assertEquals(0, management.exerciseList().size());
    }
    
    @Test
    public void addingExerciseGrowsListByOne() {
        management.add("write a test");
        assertEquals(1, management.exerciseList().size());
    }
    
    @Test
    public void addedExerciseIsInList() {
        management.add("write a test");
        assertTrue(management.exerciseList().contains("write a test"));
    }
    
    @Test
    public void exerciseCanBeMarkedAsCompleted() {
        management.add("pushups");
        management.markAsCompleted("pushups");
        assertTrue(management.isCompleted("pushups"));
    }
    
    @Test
    public void ifNotMarkedCompletedIsNotCompleted() {
        management.add("pushups");
        management.markAsCompleted("pushups");
        assertFalse(management.isCompleted("core"));
    }

}
