package ccinfom.hoa.model;

import ccinfom.hoa.model.id.DonatedAssetId;
import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "donated_assets")
public class DonatedAsset {
    @EmbeddedId
    private DonatedAssetId id;

    @MapsId("donationId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "donation_id", nullable = false)
    private AssetDonation donation;

    @MapsId("asset_id")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "asset_id", nullable = false)
    private Asset asset;

    @Column(name = "amount_donated", nullable = false, precision = 9, scale = 2)
    private BigDecimal amountDonated;

    public DonatedAssetId getId() {
        return id;
    }

    public void setId(DonatedAssetId id) {
        this.id = id;
    }

    public AssetDonation getDonation() {
        return donation;
    }

    public void setDonation(AssetDonation donation) {
        this.donation = donation;
    }

    public Asset getAsset() {
        return asset;
    }

    public void setAsset(Asset asset) {
        this.asset = asset;
    }

    public BigDecimal getAmountDonated() {
        return amountDonated;
    }

    public void setAmountDonated(BigDecimal amountDonated) {
        this.amountDonated = amountDonated;
    }

}