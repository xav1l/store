package pl.sdacademy.store.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String firstName;
    @Column
    private String lastName;

    @ManyToMany(mappedBy = "customers")
    private Set<Car> cars;

    /**
     * Encja MUSI mieć bezparametrowy konstruktor.
     * Może być też domyślny.
     */
    public Customer() {
    }

    /**
     * Encja może mieć konstruktor posiadający parametry. Należy jednak
     * pamiętać, że jeśli pojawi się inny konstruktor niż bezparametrowy,
     * to trzeba dodać też taki bez parametrów.
     *
     * @param firstName
     * @param lastName
     */
    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Set<Car> getCars() {
        return cars;
    }

    public void setCars(Set<Car> cars) {
        this.cars = cars;
    }
}
