package pl.sdacademy.store.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    public static final String[] customers = new String[]{"ja","ty","wy","my","oni"};

    /**
     * Metoda wyświetlająca stronę html z katalogu customers/ o nazwie list.html
     * @param model
     * @return
     */
    @GetMapping("/list")
    public String showList(Model model){
        model.addAttribute("customers",customers);
        return "customer/list";
    }
}
