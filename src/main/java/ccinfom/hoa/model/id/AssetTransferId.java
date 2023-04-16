package ccinfom.hoa.model.id;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

@Embeddable
public class AssetTransferId implements Serializable {
    private static final long serialVersionUID = 5045061983678775713L;
    @Column(name = "asset_id", nullable = false)
    private Integer assetId;

    @Column(name = "schedule_date", nullable = false)
    private LocalDate scheduleDate;

    public Integer getAssetId() {
        return assetId;
    }

    public void setAssetId(Integer assetId) {
        this.assetId = assetId;
    }

    public LocalDate getScheduleDate() {
        return scheduleDate;
    }

    public void setScheduleDate(LocalDate scheduleDate) {
        this.scheduleDate = scheduleDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        AssetTransferId entity = (AssetTransferId) o;
        return Objects.equals(this.assetId, entity.assetId) &&
                Objects.equals(this.scheduleDate, entity.scheduleDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(assetId, scheduleDate);
    }

}