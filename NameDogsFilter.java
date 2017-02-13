
/**
 * Write a description of NameDogsFilter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NameDogsFilter implements DogsFilter{
    private String name;
    
    public NameDogsFilter(String name) {
        this.name = name;
    }
        
    public boolean satisfies(Dog d){
        String n = d.getName();
        return name.compareTo(n)== 0? true : false;
    }
}
