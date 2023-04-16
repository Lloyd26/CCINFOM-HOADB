package ccinfom.hoa.repository;

import ccinfom.hoa.model.Donor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DonorRepository extends JpaRepository<Donor, String> {
}