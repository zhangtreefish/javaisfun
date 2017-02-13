
/**
 * Write a description of DogsKernel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.*;

public class DogsKernel {
    private ArrayList<Dog> allDogs;
    
    //constructors
    public DogsKernel() {
        allDogs = new ArrayList<Dog>();
    }
    
    //•	Constructor that accepts an initial list of dogs.
    public DogsKernel(Dog[] dogs) {
        allDogs = new ArrayList<Dog>();
        for (Dog d : dogs) {
            allDogs.add(d);
        }
    }
    
    //•	Maintains a list of dogs in alphabetical order, first by name, then by breed.
    public void sortDogs() {
        Collections.sort(allDogs, new NameAndBreedComparator()); 
    }
        
    
	//•	Provides a method for adding new dogs.
	public void addDogs(Dog[] dogs) {
		for (Dog d : dogs) {
            allDogs.add(d);
        }
	}
	
	//•	Provides a method for adding just one dog
	public void addDog(Dog d) {
		 allDogs.add(d);
	}
	
	//•	Provides a method for searching by registration number.
	public Dog getByRegNumber(String rn) {
	    RegistrationNumberDogsFilter rndf = new RegistrationNumberDogsFilter(rn);
		ArrayList<Dog> answer = filter(allDogs, rndf);
		//assuming registration number is unique, only one to be returned
		return answer.get(0);
	}
	
	//•	Provides a method for search by Name.
	public ArrayList<Dog> getByName(String rn) {
	    NameDogsFilter ndf = new NameDogsFilter(rn);
		ArrayList<Dog> answer = filter(allDogs, ndf);
		//assuming names are not unique, return all
		return answer;
	}
	
	private ArrayList<Dog> filter(ArrayList<Dog> dogs, DogsFilter f) { 
        ArrayList<Dog> answer = new ArrayList<Dog>();
        for(Dog d : dogs) { 
            if (f.satisfies(d)) { 
                answer.add(d); 
            } 
        }         
        return answer;
    } 
	
    //print dogs
	public void showcase() {
		for (Dog d: allDogs) {
			System.out.println(d);
        }
    }    
}
