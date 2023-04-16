package ccinfom.hoa.model.id;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

@Embeddable
public class AssetActivityId implements Serializable {
    private static final long serialVersionUID = -8740304461945306447L;
    @Column(name = "asset_id", nullable = false)
    private Integer assetId;

    @Column(name = "activity_date", nullable = false)
    private LocalDate activityDate;

    public Integer getAssetId() {
        return assetId;
    }

    public void setAssetId(Integer assetId) {
        this.assetId = assetId;
    }

    public LocalDate getActivityDate() {
        return activityDate;
    }

    public void setActivityDate(LocalDate activityDate) {
        this.activityDate = activityDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        AssetActivityId entity = (AssetActivityId) o;
        return Objects.equals(this.activityDate, entity.activityDate) &&
                Objects.equals(this.assetId, entity.assetId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(activityDate, assetId);
    }

}