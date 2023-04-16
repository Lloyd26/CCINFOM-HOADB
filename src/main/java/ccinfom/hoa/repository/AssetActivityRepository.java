package ccinfom.hoa.repository;

import ccinfom.hoa.model.AssetActivity;
import ccinfom.hoa.model.id.AssetActivityId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AssetActivityRepository extends JpaRepository<AssetActivity, AssetActivityId> {
}