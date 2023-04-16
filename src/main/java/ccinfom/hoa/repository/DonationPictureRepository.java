package ccinfom.hoa.repository;

import ccinfom.hoa.model.DonationPicture;
import ccinfom.hoa.model.id.DonationPictureId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DonationPictureRepository extends JpaRepository<DonationPicture, DonationPictureId> {
}