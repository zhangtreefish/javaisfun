
/**
 * Question 1
 */

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

@Entity
@Table(name = "PERSON")
public class Person {
   @Id @GeneratedValue
   @Column(name = "personId")
   private int id;

   @Column(name = "firstName")
   private String firstName;

   @Column(name = "lastName")
   private String lastName;

   @Column(name = "dateOfBirth")
   private Date dateOfBirth;  

   @Column(name = "created")
   private Timestamp created;  

   @Column(name = "modified")
   private Timestamp modified;  

   public Person() {}
   
   public int getId() {
      return id;
   }
   
   public void setId( int id ) {
      this.id = id;
   }
   
   public String getFirstName() {
      return firstName;
   }
   
   public void setFirstName( String fn ) {
      this.firstName = fn;
   }
   
   public String getLastName() {
      return lastName;
   }
   
   public void setLastName( String ln ) {
      this.lastName = ln;
   }
   
   public Date getDateOfBirth() {
      return dateOfBirth;
   }
   public void setDateOfBirth ( date dob ) {
      this.dateOfBirth = dob;
   }
   public Timestamp getCreated() {
      return created;
   }
   
   public Timestamp getModified() {
      return modified;
   }
   public void setModified( timestamp ts ) {
      this.modifed = modified;
   }
   
   @ManyToMany(cascade = CascadeType.ALL)
   @JoinTable(name = "JOB", joinColumns = { @JoinColumn(name = "personID") }, inverseJoinColumns = { @JoinColumn(name = "companyId") })	
}

