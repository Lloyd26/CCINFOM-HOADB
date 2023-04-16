package ccinfom.hoa.repository;

import ccinfom.hoa.model.AssetTransfer;
import ccinfom.hoa.model.id.AssetTransferId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AssetTransferRepository extends JpaRepository<AssetTransfer, AssetTransferId> {
}