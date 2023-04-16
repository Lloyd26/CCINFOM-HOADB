package ccinfom.hoa.model;

import ccinfom.hoa.model.id.DonationPictureId;
import jakarta.persistence.*;

@Entity
@Table(name = "donation_pictures")
public class DonationPicture {
    @EmbeddedId
    private DonationPictureId id;

    @MapsId("donationId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "donation_id", nullable = false)
    private AssetDonation donation;

    public DonationPictureId getId() {
        return id;
    }

    public void setId(DonationPictureId id) {
        this.id = id;
    }

    public AssetDonation getDonation() {
        return donation;
    }

    public void setDonation(AssetDonation donation) {
        this.donation = donation;
    }

}