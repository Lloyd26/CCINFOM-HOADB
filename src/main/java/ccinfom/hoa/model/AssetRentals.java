package ccinfom.hoa.model;

import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Entity
@Table(name = "asset_rentals")
public class AssetRentals {

    @Id
    @Column(name = "asset_id", nullable = false)
    private Integer id;

    @Id
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "rental_date")
    private Date rentalDate;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumns({
            @JoinColumn(name = "asset_id", referencedColumnName = "asset_id", nullable = false),
            @JoinColumn(name = "rental_date", referencedColumnName = "transaction_date", nullable = false),
    })
    private AssetTransactions assetTransactions;

    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "reservation_date", nullable = false)
    private Date reservationDate;

    @Column(name = "resident_id", nullable = false)
    private Residents residentId;

    @Column(name = "rental_amount", precision = 9, scale = 2)
    private Double rentalAmount;

    @Column(name = "discount", precision = 9, scale = 2)
    private Double discount;

    @Column(columnDefinition = "ENUM('R', 'C', 'O', 'N')", nullable = false)
    @Enumerated(EnumType.STRING)
    private Character status;

    @Column(name = "inspectionDetails")
    private String inspection_details;

    @Column(name = "assessed_value", precision = 9, scale = 2)
    private Double assessedValue;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumns({
            @JoinColumn(name = "accept_hoid", referencedColumnName = "ho_id"),
            @JoinColumn(name = "accept_position", referencedColumnName = "position"),
            @JoinColumn(name = "accept_electiondate", referencedColumnName = "election_date")
    })
    private Officer officer;

    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "return_date")
    private Date returnDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getRentalDate() {
        return rentalDate;
    }

    public void setRentalDate(Date rentalDate) {
        this.rentalDate = rentalDate;
    }

    public AssetTransactions getAssetTransactions() {
        return assetTransactions;
    }

    public void setAssetTransactions(AssetTransactions assetTransactions) {
        this.assetTransactions = assetTransactions;
    }

    public Date getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(Date reservationDate) {
        this.reservationDate = reservationDate;
    }

    public Residents getResidentId() {
        return residentId;
    }

    public void setResidentId(Residents residentId) {
        this.residentId = residentId;
    }

    public Double getRentalAmount() {
        return rentalAmount;
    }

    public void setRentalAmount(Double rentalAmount) {
        this.rentalAmount = rentalAmount;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public Character getStatus() {
        return status;
    }

    public void setStatus(Character status) {
        this.status = status;
    }

    public String getInspection_details() {
        return inspection_details;
    }

    public void setInspection_details(String inspection_details) {
        this.inspection_details = inspection_details;
    }

    public Double getAssessedValue() {
        return assessedValue;
    }

    public void setAssessedValue(Double assessedValue) {
        this.assessedValue = assessedValue;
    }

    public Officer getOfficer() {
        return officer;
    }

    public void setOfficer(Officer officer) {
        this.officer = officer;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }
}
