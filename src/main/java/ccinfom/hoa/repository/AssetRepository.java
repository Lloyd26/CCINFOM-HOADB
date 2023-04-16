package ccinfom.hoa.repository;

import ccinfom.hoa.model.Asset;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AssetRepository extends JpaRepository<Asset, Integer> {

    @Query(nativeQuery = true, value = "SELECT * FROM assets ORDER BY asset_id LIMIT :limit")
    List<Asset> findAllLimit(@Param("limit") int limit);
}