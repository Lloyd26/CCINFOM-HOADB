package ccinfom.hoa.repository;

import ccinfom.hoa.model.Homeowner;
import ccinfom.hoa.model.People;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HomeownerRepository extends JpaRepository<Homeowner, People> {
}
