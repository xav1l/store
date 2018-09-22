package pl.sdacademy.store.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.sdacademy.store.components.MyClass;
import pl.sdacademy.store.services.CustomerService;

@Controller
@RequestMapping("/")
public class IndexController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping
    public String showIndex(Model model){
        model.addAttribute("customers", customerService.findAll());
        return "index";
    }
}
