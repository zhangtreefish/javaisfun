
/**
 * Write a description of NameAndBreedComparator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;

public class NameAndBreedComparator implements Comparator<Dog> {
    public int compare(Dog d1, Dog d2) {
        //first by name; if tie by breed.
        int res = d1.getName().compareTo(d2.getName());
        if (res != 0) {
            return res;
        }
        else {
            return d1.getBreed().compareTo(d2.getBreed());
        }
    }
}
