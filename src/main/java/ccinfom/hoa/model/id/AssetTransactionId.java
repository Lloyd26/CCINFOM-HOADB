package ccinfom.hoa.model.id;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

@Embeddable
public class AssetTransactionId implements Serializable {
    private static final long serialVersionUID = -7399914661557801989L;
    @Column(name = "asset_id", nullable = false)
    private Integer assetId;

    @Column(name = "transaction_date", nullable = false)
    private LocalDate transactionDate;

    public Integer getAssetId() {
        return assetId;
    }

    public void setAssetId(Integer assetId) {
        this.assetId = assetId;
    }

    public LocalDate getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(LocalDate transactionDate) {
        this.transactionDate = transactionDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        AssetTransactionId entity = (AssetTransactionId) o;
        return Objects.equals(this.assetId, entity.assetId) &&
                Objects.equals(this.transactionDate, entity.transactionDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(assetId, transactionDate);
    }

}