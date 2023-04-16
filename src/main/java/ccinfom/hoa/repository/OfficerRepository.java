package ccinfom.hoa.repository;

import ccinfom.hoa.model.Officer;
import ccinfom.hoa.model.id.OfficerId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OfficerRepository extends JpaRepository<Officer, OfficerId> {
}