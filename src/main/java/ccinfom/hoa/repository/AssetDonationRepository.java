package ccinfom.hoa.repository;

import ccinfom.hoa.model.AssetDonation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AssetDonationRepository extends JpaRepository<AssetDonation, Integer> {

    @Query(nativeQuery = true, value = "SELECT * FROM asset_donations ORDER BY donation_id LIMIT :limit")
    List<AssetDonation> findAllLimit(@Param("limit") int limit);
}