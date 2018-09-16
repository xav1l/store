package pl.sdacademy.store.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.sdacademy.store.model.Policy;
import pl.sdacademy.store.respositories.PolicyRepository;


import java.util.List;

@Controller
@RequestMapping("/policy")
public class PolicyController {

    private final PolicyRepository policyRepository;

    @Autowired
    public PolicyController(PolicyRepository policyRepository) {
        this.policyRepository = policyRepository;
    }

    @GetMapping("/list")
    public String showList(Model model) {
        List<Policy> policy = policyRepository.findAll();
        model.addAttribute("policy", policy);
        return "policy/list";
    }

    @GetMapping("/{id}/edit")
    public String editCar(@PathVariable("id") Integer id, Model model) {
        Policy policy = policyRepository.findById(id).get();
        model.addAttribute("policy", policy);
        return "policy/edit";
    }

}
