package test;

import man.woman.Man;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ManTests {
    @Test
    public void manCorrectRetiredAge(){
        // Arrange + Act
        Man man = new Man("Den", "Rudenko", 70, true);
        // Assert
        Assert.assertTrue(man.isRetired(), "Incorrect retiring age");
    }
}
