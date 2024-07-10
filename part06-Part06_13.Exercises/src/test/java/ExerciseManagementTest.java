import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ExerciseManagementTest {
    //runs everytime before the each test
    @Before
    public void setup(){
        
    }

    //checking 
    @Test
    public void exerciseListEmptyAtBeginning(){
        ExerciseManagement management = new ExerciseManagement();
        assertEquals(0, management.exerciseList().size());
    }

    //test for adding new exercises
    @Test
    public void exerciseListAddingItems(){
        ExerciseManagement management = new ExerciseManagement();

        management.add("First");
        assertEquals(1, management.exerciseList().size());
    }
}