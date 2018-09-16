package pl.sdacademy.store.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.sdacademy.store.model.Car;
import pl.sdacademy.store.respositories.CarRepository;


import java.util.List;

@Controller
@RequestMapping("/car")
public class CarController {


    private final CarRepository carRepository;

    /**
     * Konstruktor z wstrzykniętym repozytorium
     *
     * @param carRepository
     */
    @Autowired
    public CarController(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    /**
     * Pokazuje listę dostępnych samochodów
     * @param model
     * @return
     */
    @GetMapping("/list")
    public String showList(Model model) {
        List<Car> cars = carRepository.findAll();
        model.addAttribute("cars", cars);
        return "car/list";
    }

    /**
     * Pokazuje stronę edycji samochodu o ID podanym w parametrze
     * @param id
     * @param model
     * @return
     */
    @GetMapping("/{id}/edit")
    public String showEditCustomer(@PathVariable("id") Integer id, Model model){
        Car first = carRepository.findById(id).get();
        model.addAttribute("car", first);

        return "car/edit";
    }
}
