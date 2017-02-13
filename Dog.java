
/**
 * Write a description of Dog here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Dog {
     private String name;
     private String breed;
     private String registrationNumber;

     public Dog(String name, String breed, String registrationNumber) {
         this.name = name;
         this.breed = breed;
         this.registrationNumber = registrationNumber;
     }
    
     public String getName() {
    	return this.name;
     }
    
     public String getBreed() {
    	return this.breed;
     }
    
     public String getRegistrationNumber() {
    	return this.registrationNumber;
     }
     
     public String toString(){
		return String.format("name= %s, breed= %s, registrationNumber = %s", name, breed, registrationNumber);
	}
}

