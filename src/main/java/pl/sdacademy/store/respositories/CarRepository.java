package pl.sdacademy.store.respositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.sdacademy.store.model.Car;

public interface CarRepository extends JpaRepository<Car, Integer> {
}
