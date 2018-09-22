package pl.sdacademy.store.dtos;

import pl.sdacademy.store.model.Customer;

public class CustomerDto {
    private Integer id;
    private String firstName;
    private String lastName;

    public CustomerDto() {

    }

    public CustomerDto(Customer customer) {
        this.id = customer.getId();
        this.firstName = customer.getFirstName();
        this.lastName = customer.getLastName();
    }

    public Integer getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
