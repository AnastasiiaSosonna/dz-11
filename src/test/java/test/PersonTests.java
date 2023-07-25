package test;

import man.woman.Man;
import man.woman.Person;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PersonTests {

    @Test
    public void firstNameIsNotNull() {
        Person person = new Person("name", "surname", 30, false);
        Assert.assertNotNull(person.firstName, "First name is null");
    }
    @Test
    public void lastNameIsNotNull() {
        Person person = new Person("name", "surname", 30, false);
        Assert.assertNotNull(person.lastName, "Last name is null");
    }

    @Test
    public void ageIsNotNull() {
        Person person = new Person("name", "surname", 30, false);
        Assert.assertNotNull(person.age, "Age is null");
    }
    @Test
    public void partnerIsNotNull() {
        Person person = new Person("name", "surname", 30, false);
        Assert.assertNotNull(person.partner, "Partner is null");
    }

     @Test
     public void getterAgeTest(){
         // Arrange + Act
         Person person = new Person("Den", "Rudenko", 70, true);
         // Assert
         Assert.assertEquals(person.getAge(), 70);
     }

     @Test
     public void setterAgeTest(){
         // Arrange
         Person person = new Person("Den", "Rudenko", 70, true);
         // Act
         person.setAge(13);
         // Assert
         Assert.assertEquals(person.getAge(), 13);
     }
     @Test
     public void getterLastNameTest(){
         // Arrange + Act
         Person person = new Person("Den", "Rudenko", 70, true);
         // Assert
         Assert.assertEquals(person.getLastName(), "Rudenko");
     }

     @Test
     public void setterLastNameTest() {
         // Arrange
         Person person = new Person("Den", "Rudenko", 70, true);
         // Act
         person.setLastName("Potter");
         // Assert
         Assert.assertEquals(person.getLastName(), "Potter");
     }
     @Test
     public void getterPartnershipTest(){
         // Arrange + Act
         Person person = new Person("Den", "Rudenko", 70, true);
         // Assert
         Assert.assertEquals(person.getPartnership(), true);
     }

     @Test
     public void setterPartnershipTest() {
         // Arrange
         Person person = new Person("Den", "Rudenko", 70, true);
         // Act
         person.setPartnership(false);
         // Assert
         Assert.assertEquals(person.getPartnership(), false);
     }
}
