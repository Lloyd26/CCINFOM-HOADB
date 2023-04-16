package ccinfom.hoa.model.id;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class DonatedAssetId implements Serializable {
    private static final long serialVersionUID = -1842248906197212069L;
    @Column(name = "donation_id", nullable = false)
    private Integer donationId;

    @Column(name = "asset_id", nullable = false)
    private Integer assetId;

    public Integer getDonationId() {
        return donationId;
    }

    public void setDonationId(Integer donationId) {
        this.donationId = donationId;
    }

    public Integer getAssetId() {
        return assetId;
    }

    public void setAssetId(Integer assetId) {
        this.assetId = assetId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        DonatedAssetId entity = (DonatedAssetId) o;
        return Objects.equals(this.assetId, entity.assetId) &&
                Objects.equals(this.donationId, entity.donationId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(assetId, donationId);
    }

}