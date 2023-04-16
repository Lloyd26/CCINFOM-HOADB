package ccinfom.hoa.model;

import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Entity
@Table(name = "asset_activity")
public class AssetActivity {

    @Id
    @Column(name = "asset_id", nullable = false)
    private Integer id;

    @Id
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "activity_date")
    private Date activtyDate;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumns({
            @JoinColumn(name = "asset_id", referencedColumnName = "asset_id", nullable = false),
            @JoinColumn(name = "activity_date", referencedColumnName = "transaction_date", nullable = false),
    })
    private AssetTransactions assetTransactions;

    @Column(name = "activity_description", length = 45)
    private String activityName;

    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "tent_start")
    private Date tentStart;

    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "tent_end")
    private Date tentEnd;

    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "act_start")
    private Date actStart;

    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "act_end")
    private Date actEnd;

    @Column(name = "cost", precision = 9, scale = 2)
    private Double cost;

    @Column(columnDefinition = "ENUM('S', 'O', 'C')", nullable = false)
    @Enumerated(EnumType.STRING)
    private Character status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getActivtyDate() {
        return activtyDate;
    }

    public void setActivtyDate(Date activtyDate) {
        this.activtyDate = activtyDate;
    }

    public AssetTransactions getAssetTransactions() {
        return assetTransactions;
    }

    public void setAssetTransactions(AssetTransactions assetTransactions) {
        this.assetTransactions = assetTransactions;
    }

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    public Date getTentStart() {
        return tentStart;
    }

    public void setTentStart(Date tentStart) {
        this.tentStart = tentStart;
    }

    public Date getTentEnd() {
        return tentEnd;
    }

    public void setTentEnd(Date tentEnd) {
        this.tentEnd = tentEnd;
    }

    public Date getActStart() {
        return actStart;
    }

    public void setActStart(Date actStart) {
        this.actStart = actStart;
    }

    public Date getActEnd() {
        return actEnd;
    }

    public void setActEnd(Date actEnd) {
        this.actEnd = actEnd;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public Character getStatus() {
        return status;
    }

    public void setStatus(Character status) {
        this.status = status;
    }
}
