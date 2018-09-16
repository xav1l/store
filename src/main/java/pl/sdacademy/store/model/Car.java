package pl.sdacademy.store.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "cars")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String marka;

    @Column
    private String model;

    @Column
    private Integer rocznik;

    @Column
    private String nrRej;

    @OneToMany(mappedBy = "car")
    private Set<Policy> policies;

    @ManyToMany
    @JoinTable(name = "cars_customers",
            joinColumns = {
                    @JoinColumn(name = "car_id")
            },
            inverseJoinColumns = {
                    @JoinColumn(name = "customer_id")
            }
    )
    private Set<Customer> customers;

    public Car(){

    }

    public Car(String marka, String model, Integer rocznik, String nrRej) {
        this.marka = marka;
        this.model = model;
        this.rocznik = rocznik;
        this.nrRej = nrRej;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getRocznik() {
        return rocznik;
    }

    public void setRocznik(Integer rocznik) {
        this.rocznik = rocznik;
    }

    public String getNrRej() {
        return nrRej;
    }

    public void setNrRej(String nrRej) {
        this.nrRej = nrRej;
    }

    public Set<Policy> getPolicies() {
        return policies;
    }

    public void setPolicies(Set<Policy> policies) {
        this.policies = policies;
    }

    public Set<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(Set<Customer> customers) {
        this.customers = customers;
    }
}
