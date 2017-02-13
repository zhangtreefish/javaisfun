
/**
 * Question 2
 */

import java.util.*;

public class DogsKernelClient {
    public void testDogKernel() {
		Dog d1 = new Dog("Beethoven", "St. Bernard", "1");
		Dog d2 = new Dog("Terry", "Terrier", "2");
		Dog d3 = new Dog("Lassie", "Collie", "3");
		Dog d4 = new Dog("Lassie", "Shih Tsu", "4");
		Dog d16 = new Dog("Bolt", "Shepherd Dog", "16");
		Dog d5 = new Dog("Shiloh", "Beagle", "5");
		Dog[] pack = {d1, d2, d3, d4, d16};

		DogsKernel myKernel = new DogsKernel();
		
		//test addDogs() and addDog()
		//•	Provides a method for adding new dogs.
		myKernel.addDogs(pack);
		myKernel.addDog(d5);
		myKernel.showcase();
		
		//test getByRegNumber()
		//•	Provides a method for searching by registration number.
		Dog dogByRegNum = myKernel.getByRegNumber("16");
		System.out.println("Dog with Registration Number of 16 is: ");
		System.out.println(dogByRegNum); 
		
		//test getByName()
		//•	Provides a method for search by Name.
		ArrayList<Dog> dogsByName = myKernel.getByName("Lassie");
		System.out.println("Dogs with Name of Lassie are: ");
		for (Dog d : dogsByName) {
		    System.out.println(d);
		}
		
		//test sortDogs
		//•	Maintains a list of dogs in alphabetical order, first by name, then by breed.
		System.out.println("Sorting the dogs b name and breed now..., the result is:  ");
		myKernel.sortDogs();		
		myKernel.showcase();
	}	
}
