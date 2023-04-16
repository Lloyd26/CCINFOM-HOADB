package ccinfom.hoa.repository;

import ccinfom.hoa.model.AssetTransaction;
import ccinfom.hoa.model.id.AssetTransactionId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AssetTransactionRepository extends JpaRepository<AssetTransaction, AssetTransactionId> {
}