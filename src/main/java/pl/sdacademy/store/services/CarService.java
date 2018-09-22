package pl.sdacademy.store.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.sdacademy.store.model.Car;
import pl.sdacademy.store.respositories.CarRepository;

import java.util.List;

@Service
public class CarService {

    private final CarRepository carRepository;

    @Autowired
    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public List<Car> findAll() {
        return carRepository.findAll();
    }

    public Car getCar(Integer id) {
        return carRepository.findById(id).get();
    }

    public Car save(Car car) {
        return carRepository.save(car);
    }
}
