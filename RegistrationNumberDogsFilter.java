
/**
 * Write a description of RegistrationNumberDogFilter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RegistrationNumberDogsFilter implements DogsFilter{
    private String regNumber;
    
    public RegistrationNumberDogsFilter(String regNumber) {
        this.regNumber = regNumber;
    }
        
    public boolean satisfies(Dog d){
        String rn = d.getRegistrationNumber();
        return regNumber.compareTo(rn)== 0? true : false;
    }
}
