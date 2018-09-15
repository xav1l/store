package pl.sdacademy.store.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.sdacademy.store.components.MyClass;

@Controller
@RequestMapping("/")
public class IndexController {

    @Autowired
    MyClass counter;

    @RequestMapping
    public String showIndex(Model model){
        model.addAttribute("counter",counter.getCounter());
        return "index";
    }
}
