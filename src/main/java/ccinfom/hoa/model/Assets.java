package ccinfom.hoa.model;

import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Entity
@Table(name = "assets")
public class Assets {

    @Id
    @Column(name = "asset_id", nullable = false)
    private Integer id;

    @Column(name = "asset_name", nullable = false, length = 45)
    private String assetName;

    @Column(name = "asset_description", nullable = false, length = 45)
    private String assetDescription;

    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "acquisition_date", nullable = false)
    private Date acquisition_date;

    @Column(name = "forrent", nullable = false)
    private Boolean forrent;

    @Column(name = "asset_value", nullable = false, precision = 9, scale = 2)
    private Double assetValue;

    @Column(columnDefinition = "ENUM('P', 'E', 'F', 'O')", nullable = false)
    @Enumerated(EnumType.STRING)
    private Character typeAsset;

    @Column(columnDefinition = "ENUM('W', 'D', 'P', 'S', 'X')", nullable = false)
    @Enumerated(EnumType.STRING)
    private Character status;

    @Column(name = "loc_lattitude", nullable = false, precision = 7, scale = 4)
    private Double locLattitude;

    @Column(name = "loc_longitude", nullable = false, precision = 7, scale = 4)
    private Double locLongitude;

    @Column(name = "hoa_name", nullable = false, length = 45)
    private Hoa hoaName;

    @Column(name = "enclosing_asset")
    private Integer enclosingAsset;

    @Column(name = "isDeleted", nullable = false)
    private Boolean isDeleted;

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

    public Date getAcquisition_date() {
        return acquisition_date;
    }

    public void setAcquisition_date(Date acquisition_date) {
        this.acquisition_date = acquisition_date;
    }

    public Boolean getForrent() {
        return forrent;
    }

    public void setForrent(Boolean forrent) {
        this.forrent = forrent;
    }

    public Double getAssetValue() {
        return assetValue;
    }

    public void setAssetValue(Double assetValue) {
        this.assetValue = assetValue;
    }

    public Character getTypeAsset() {
        return typeAsset;
    }

    public void setTypeAsset(Character typeAsset) {
        this.typeAsset = typeAsset;
    }

    public Character getStatus() {
        return status;
    }

    public void setStatus(Character status) {
        this.status = status;
    }

    public Double getLocLattitude() {
        return locLattitude;
    }

    public void setLocLattitude(Double locLattitude) {
        this.locLattitude = locLattitude;
    }

    public Double getLocLongitude() {
        return locLongitude;
    }

    public void setLocLongitude(Double locLongitude) {
        this.locLongitude = locLongitude;
    }

    public Hoa getHoaName() {
        return hoaName;
    }

    public void setHoaName(Hoa hoaName) {
        this.hoaName = hoaName;
    }

    public Integer getEnclosingAsset() {
        return enclosingAsset;
    }

    public void setEnclosingAsset(Integer enclosingAsset) {
        this.enclosingAsset = enclosingAsset;
    }

    public Boolean getDeleted() {
        return isDeleted;
    }

    public void setDeleted(Boolean deleted) {
        isDeleted = deleted;
    }
}
