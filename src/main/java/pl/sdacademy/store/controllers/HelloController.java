package pl.sdacademy.store.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import pl.sdacademy.store.components.MyClass;

import java.util.Arrays;
import java.util.List;

@Controller
public class HelloController {

    @Autowired
    MyClass counter;

    @GetMapping("/hello")
    public String showHello(String firstName, ModelMap modelMap) {
        modelMap.addAttribute("counter", counter.getCounter());
        modelMap.addAttribute("firstName", firstName);
        return "hello";
    }

    @GetMapping("/zero")
    public String makeCounterZero() {
        counter.makeZero();
        return "redirect:/";
    }

    @GetMapping("/set")
    public String showSetCounter(ModelMap model) {
        return "form";
    }

    @PostMapping("/set")
    public String setCounter(Integer number, ModelMap model) {
        counter.setCounter(number);
//        model.addAttribute("counter", counter.getCounter());
        return "redirect:/";
    }

    @GetMapping("/list")
    public String showList(ModelMap modelMap){
        List<String> names = Arrays.asList("Adrian", "Damian", "Jola", "Dawid", "Dominika", "Karol");
        modelMap.addAttribute("names",names);
        return "list";
    }
}

