package ccinfom.hoa.model;

import ccinfom.hoa.model.id.AssetActivityId;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "asset_activity")
public class AssetActivity {
    @EmbeddedId
    private AssetActivityId id;

    @MapsId("asset_id")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumns({
            @JoinColumn(name = "asset_id", nullable = false, referencedColumnName = "asset_id"),
            @JoinColumn(name = "activity_date", nullable = false, referencedColumnName = "transaction_date")
    })
    private AssetTransaction asset;

    @Column(name = "activity_description", length = 45)
    private String activityDescription;

    @Column(name = "tent_start")
    private LocalDate tentStart;

    @Column(name = "tent_end")
    private LocalDate tentEnd;

    @Column(name = "act_start")
    private LocalDate actStart;

    @Column(name = "act_end")
    private LocalDate actEnd;

    @Column(name = "cost", precision = 9, scale = 2)
    private BigDecimal cost;

    @Lob
    @Column(name = "status", nullable = false)
    private String status;

    public AssetActivityId getId() {
        return id;
    }

    public void setId(AssetActivityId id) {
        this.id = id;
    }

    public AssetTransaction getAsset() {
        return asset;
    }

    public void setAsset(AssetTransaction asset) {
        this.asset = asset;
    }

    public String getActivityDescription() {
        return activityDescription;
    }

    public void setActivityDescription(String activityDescription) {
        this.activityDescription = activityDescription;
    }

    public LocalDate getTentStart() {
        return tentStart;
    }

    public void setTentStart(LocalDate tentStart) {
        this.tentStart = tentStart;
    }

    public LocalDate getTentEnd() {
        return tentEnd;
    }

    public void setTentEnd(LocalDate tentEnd) {
        this.tentEnd = tentEnd;
    }

    public LocalDate getActStart() {
        return actStart;
    }

    public void setActStart(LocalDate actStart) {
        this.actStart = actStart;
    }

    public LocalDate getActEnd() {
        return actEnd;
    }

    public void setActEnd(LocalDate actEnd) {
        this.actEnd = actEnd;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}