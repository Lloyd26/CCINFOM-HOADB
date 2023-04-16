package ccinfom.hoa.repository;

import ccinfom.hoa.model.Election;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;

public interface ElectionRepository extends JpaRepository<Election, LocalDate> {
}