package ccinfom.hoa.repository;

import ccinfom.hoa.model.Property;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PropertyRepository extends JpaRepository<Property, String> {
}