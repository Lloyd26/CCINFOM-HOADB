package ccinfom.hoa.repository;

import ccinfom.hoa.model.AssetRental;
import ccinfom.hoa.model.id.AssetRentalId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AssetRentalRepository extends JpaRepository<AssetRental, AssetRentalId> {
}