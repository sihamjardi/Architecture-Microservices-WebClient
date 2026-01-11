package ma.siham.vehicle.domain;

// DTO servant à mapper la réponse JSON distante
public class CustomerDTO {
    private Long id;
    private String fullName;
    private Float age;

    public CustomerDTO() {}

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Float getAge() {
        return age;
    }

    public void setAge(Float age) {
        this.age = age;
    }
}
