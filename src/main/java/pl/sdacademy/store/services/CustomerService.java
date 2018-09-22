package pl.sdacademy.store.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.sdacademy.store.exceptions.WrongObjectException;
import pl.sdacademy.store.model.Customer;
import pl.sdacademy.store.respositories.CustomerRepository;

import java.util.List;

@Service
public class CustomerService {
    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    public Customer get(Integer id) {
        return customerRepository.findById(id).orElseThrow(() -> new RuntimeException("Brak wpisu w bazie"));
    }

    public void update(Customer customer, Customer updatedCustomer) {
        if (updatedCustomer.getId().equals(customer.getId())) {
            save(updatedCustomer);
        } else {
            throw new WrongObjectException("Id obiektów się nie zgadzają");
        }
    }

    public void save(Customer updatedCustomer) {
        customerRepository.save(updatedCustomer);
    }

    public void delete(Integer id) {
        Customer customer = get(id);
        customerRepository.deleteById(customer.getId());
    }
}
