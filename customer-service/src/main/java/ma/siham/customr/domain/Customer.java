package ma.siham.customr.domain;
import jakarta.persistence.*;

@Entity   // Cette classe devient une table MySQL
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fullName;
    private Float age;

    // Constructeur vide obligatoire pour JPA
    public Customer() {}

    public Customer(Long id, String fullName, Float age) {
        this.id = id;
        this.fullName = fullName;
        this.age = age;
    }

    // Getters & setters
    public Long getId() { return id; }
    public String getFullName() { return fullName; }
    public Float getAge() { return age; }

    public void setId(Long id) { this.id = id; }
    public void setFullName(String fullName) { this.fullName = fullName; }
    public void setAge(Float age) { this.age = age; }
}
