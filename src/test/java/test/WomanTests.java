package test;

import man.woman.Man;
import man.woman.Woman;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WomanTests {
    @Test
    public void womanCorrectRetiredAge(){
        // Arrange + Act
        Woman woman= new Woman("Elisa", "Luice", 80, false);
        // Assert
        Assert.assertTrue(woman.isRetired(), "Incorrect age for retired woman");
    }
/*    @Test
    public void womanRegisteredPartnership(){
        // Arrange + Act
        Woman woman= new Woman("Elisa", "Luice", 30, false);
        // Assert
        Assert.assertTrue(woman.registerPartnership(man.getLastName()), "Woman is not married");
    }

 */
}
