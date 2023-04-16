package ccinfom.hoa.model;

import ccinfom.hoa.model.id.AssetTransferId;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "asset_transfer")
public class AssetTransfer {
    @EmbeddedId
    private AssetTransferId id;

    @MapsId("asset_id")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumns({
            @JoinColumn(name = "asset_id", nullable = false, referencedColumnName = "asset_id"),
            @JoinColumn(name = "schedule_date", nullable = false, referencedColumnName = "transaction_date")
    })
    private AssetTransaction asset;

    @Column(name = "act_date")
    private LocalDate actDate;

    @Column(name = "source_lattitude", nullable = false, precision = 7, scale = 4)
    private BigDecimal sourceLattitude;

    @Column(name = "source_longitude", nullable = false, precision = 7, scale = 4)
    private BigDecimal sourceLongitude;

    @Column(name = "dest_latittude", nullable = false, precision = 7, scale = 4)
    private BigDecimal destLatittude;

    @Column(name = "dest_longitude", nullable = false, precision = 7, scale = 4)
    private BigDecimal destLongitude;

    @Column(name = "transfer_cost", precision = 9, scale = 2)
    private BigDecimal transferCost;

    @Lob
    @Column(name = "status", nullable = false)
    private String status;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "completename", nullable = false)
    private Outsider completename;

    public AssetTransferId getId() {
        return id;
    }

    public void setId(AssetTransferId id) {
        this.id = id;
    }

    public AssetTransaction getAsset() {
        return asset;
    }

    public void setAsset(AssetTransaction asset) {
        this.asset = asset;
    }

    public LocalDate getActDate() {
        return actDate;
    }

    public void setActDate(LocalDate actDate) {
        this.actDate = actDate;
    }

    public BigDecimal getSourceLattitude() {
        return sourceLattitude;
    }

    public void setSourceLattitude(BigDecimal sourceLattitude) {
        this.sourceLattitude = sourceLattitude;
    }

    public BigDecimal getSourceLongitude() {
        return sourceLongitude;
    }

    public void setSourceLongitude(BigDecimal sourceLongitude) {
        this.sourceLongitude = sourceLongitude;
    }

    public BigDecimal getDestLatittude() {
        return destLatittude;
    }

    public void setDestLatittude(BigDecimal destLatittude) {
        this.destLatittude = destLatittude;
    }

    public BigDecimal getDestLongitude() {
        return destLongitude;
    }

    public void setDestLongitude(BigDecimal destLongitude) {
        this.destLongitude = destLongitude;
    }

    public BigDecimal getTransferCost() {
        return transferCost;
    }

    public void setTransferCost(BigDecimal transferCost) {
        this.transferCost = transferCost;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Outsider getCompletename() {
        return completename;
    }

    public void setCompletename(Outsider completename) {
        this.completename = completename;
    }

}