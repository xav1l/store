package pl.sdacademy.store.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.sdacademy.store.dtos.CustomerDto;
import pl.sdacademy.store.model.Customer;
import pl.sdacademy.store.services.CustomerService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/rest/customer")
public class RestCustomerController {

    private final CustomerService customerService;

    @Autowired
    public RestCustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping(value = "/list", produces = "application/json")
    public List<CustomerDto> showList() {
        List<Customer> all = customerService.findAll();
        return all.stream().map(customer -> new CustomerDto(customer)).collect(Collectors.toList());
    }

    @PutMapping(value = "/{id}/edit", consumes = "application/json")
    public CustomerDto editCustomer(@PathVariable("id") Integer id, CustomerDto customerDto) {
        Customer customer = customerService.get(id);
        Customer updatedCustomer = new Customer();
        customerService.update(customer, updatedCustomer);
        return customerDto;
    }

    @DeleteMapping("{id}/delete")
    public void deleteCustomer(@PathVariable("id") Integer id) {
        customerService.delete(id);
    }
}
