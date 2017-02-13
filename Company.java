
/**
 * Question 1
 */
import javax.persistence.*;

@Entity
@Table(name = "COMPANY")
public class Company {
   @Id @GeneratedValue
   @Column(name = "companyId")
   private int id;

   @Column(name = "name")
   private String name;

   @Column(name = "description")
   private String description;

   public Company() {}
   
   public int getId() {
      return id;
   }
   
   public void setId( int id ) {
      this.id = id;
   }
   
   public String getName() {
      return name;
   }
   
   public void setName( String name ) {
      this.name = name;
   }
   
   public String getDescription() {
      return description;
   }   
}

