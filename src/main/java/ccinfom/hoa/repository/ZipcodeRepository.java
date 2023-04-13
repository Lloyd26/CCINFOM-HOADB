package ccinfom.hoa.repository;

import ccinfom.hoa.model.Zipcode;
import ccinfom.hoa.model.id.ZipcodeId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ZipcodeRepository extends JpaRepository<Zipcode, ZipcodeId> {
}
