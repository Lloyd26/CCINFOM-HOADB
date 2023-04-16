package ccinfom.hoa.model.id;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

@Embeddable
public class AssetRentalId implements Serializable {
    private static final long serialVersionUID = -8721523659081731738L;
    @Column(name = "asset_id", nullable = false)
    private Integer assetId;

    @Column(name = "rental_date", nullable = false)
    private LocalDate rentalDate;

    public Integer getAssetId() {
        return assetId;
    }

    public void setAssetId(Integer assetId) {
        this.assetId = assetId;
    }

    public LocalDate getRentalDate() {
        return rentalDate;
    }

    public void setRentalDate(LocalDate rentalDate) {
        this.rentalDate = rentalDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        AssetRentalId entity = (AssetRentalId) o;
        return Objects.equals(this.rentalDate, entity.rentalDate) &&
                Objects.equals(this.assetId, entity.assetId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rentalDate, assetId);
    }

}