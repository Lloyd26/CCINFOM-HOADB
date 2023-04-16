package ccinfom.hoa.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "assets")
public class Asset {
    @Id
    @Column(name = "asset_id", nullable = false)
    private Integer id;

    @Column(name = "asset_name", nullable = false, length = 45)
    private String assetName;

    @Column(name = "asset_description", nullable = false, length = 45)
    private String assetDescription;

    @Column(name = "acquisition_date", nullable = false)
    private LocalDate acquisitionDate;

    @Column(name = "forrent", nullable = false)
    private Boolean forrent = false;

    @Column(name = "asset_value", nullable = false, precision = 9, scale = 2)
    private BigDecimal assetValue;

    @Lob
    @Column(name = "type_asset", nullable = false)
    private String typeAsset;

    @Lob
    @Column(name = "status", nullable = false)
    private String status;

    @Column(name = "loc_lattitude", nullable = false, precision = 7, scale = 4)
    private BigDecimal locLattitude;

    @Column(name = "loc_longitude", nullable = false, precision = 7, scale = 4)
    private BigDecimal locLongitude;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "hoa_name", nullable = false)
    private Hoa hoaName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "enclosing_asset")
    private Asset enclosingAsset;

    public Asset() {}

    public Asset(Integer id, String assetName, String assetDescription, LocalDate acquisitionDate, Boolean forrent, BigDecimal assetValue, String typeAsset, String status, BigDecimal locLattitude, BigDecimal locLongiture, Hoa hoaName, Asset enclosingAsset) {
        this.id = id;
        this.assetName = assetName;
        this.assetDescription = assetDescription;
        this.acquisitionDate = acquisitionDate;
        this.forrent = forrent;
        this.assetValue = assetValue;
        this.typeAsset = typeAsset;
        this.status = status;
        this.locLattitude = locLattitude;
        this.locLongitude = locLongitude;
        this.hoaName = hoaName;
        this.enclosingAsset = enclosingAsset;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAssetName() {
        return assetName;
    }

    public void setAssetName(String assetName) {
        this.assetName = assetName;
    }

    public String getAssetDescription() {
        return assetDescription;
    }

    public void setAssetDescription(String assetDescription) {
        this.assetDescription = assetDescription;
    }

    public LocalDate getAcquisitionDate() {
        return acquisitionDate;
    }

    public void setAcquisitionDate(LocalDate acquisitionDate) {
        this.acquisitionDate = acquisitionDate;
    }

    public Boolean getForrent() {
        return forrent;
    }

    public void setForrent(Boolean forrent) {
        this.forrent = forrent;
    }

    public BigDecimal getAssetValue() {
        return assetValue;
    }

    public void setAssetValue(BigDecimal assetValue) {
        this.assetValue = assetValue;
    }

    public String getTypeAsset() {
        return typeAsset;
    }

    public void setTypeAsset(String typeAsset) {
        this.typeAsset = typeAsset;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public BigDecimal getLocLattitude() {
        return locLattitude;
    }

    public void setLocLattitude(BigDecimal locLattitude) {
        this.locLattitude = locLattitude;
    }

    public BigDecimal getLocLongitude() {
        return locLongitude;
    }

    public void setLocLongitude(BigDecimal locLongitude) {
        this.locLongitude = locLongitude;
    }

    public Hoa getHoaName() {
        return hoaName;
    }

    public void setHoaName(Hoa hoaName) {
        this.hoaName = hoaName;
    }

    public Asset getEnclosingAsset() {
        return enclosingAsset;
    }

    public void setEnclosingAsset(Asset enclosingAsset) {
        this.enclosingAsset = enclosingAsset;
    }

}