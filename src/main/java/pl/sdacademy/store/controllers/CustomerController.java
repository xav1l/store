package pl.sdacademy.store.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.sdacademy.store.model.Customer;
import pl.sdacademy.store.respositories.CustomerRepository;


import java.util.List;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    private final CustomerRepository customerRepository;

    /**
     * Konstruktor z wstrzykniętym repozytorium
     *
     * @param customerRepository
     */
    @Autowired
    public CustomerController(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    /**
     * Pokazuje listę dostępnych klientów
     *
     * @param model
     * @return
     */
    @GetMapping("/list")
    public String showList(Model model) {
        List<Customer> customers = customerRepository.findAll();
        model.addAttribute("customers", customers);
        return "customer/list";
    }

    /**
     * Edytuje klienta o podanym id w parametrze
     *
     * @param id
     * @param model
     * @return
     */
    @GetMapping("/{id}/edit")
    public String showEditCustomer(@PathVariable("id") Integer id, Model model) {
        Customer first = customerRepository.findById(id).get();
        model.addAttribute("customer", first);
        return "customer/edit";
    }

    @PostMapping("/save")
    public String saveCustomer(Customer customer){

        return "redirect:/customer/list";
    }
}
