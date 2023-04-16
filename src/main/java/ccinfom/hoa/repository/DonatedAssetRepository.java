package ccinfom.hoa.repository;

import ccinfom.hoa.model.DonatedAsset;
import ccinfom.hoa.model.id.DonatedAssetId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DonatedAssetRepository extends JpaRepository<DonatedAsset, DonatedAssetId> {
}