package pl.sdacademy.store.respositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.sdacademy.store.model.Policy;

public interface PolicyRepository extends JpaRepository<Policy, Integer> {
}
