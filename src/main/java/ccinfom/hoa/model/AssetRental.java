package ccinfom.hoa.model;

import ccinfom.hoa.model.id.AssetRentalId;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "asset_rentals")
public class AssetRental {
    @EmbeddedId
    private AssetRentalId id;

    @MapsId("asset_id")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumns({
            @JoinColumn(name = "asset_id", nullable = false, referencedColumnName = "asset_id"),
            @JoinColumn(name = "rental_date", nullable = false, referencedColumnName = "transaction_date")
    })
    private AssetTransaction asset;

    @Column(name = "reservation_date", nullable = false)
    private LocalDate reservationDate;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "resident_id", nullable = false)
    private Resident resident;

    @Column(name = "rental_amount", precision = 9, scale = 2)
    private BigDecimal rentalAmount;

    @Column(name = "discount", precision = 9, scale = 2)
    private BigDecimal discount;

    @Lob
    @Column(name = "status", nullable = false)
    private String status;

    @Lob
    @Column(name = "inspection_details")
    private String inspectionDetails;

    @Column(name = "assessed_value", precision = 9, scale = 2)
    private BigDecimal assessedValue;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
            @JoinColumn(name = "accept_hoid", nullable = false, referencedColumnName = "ho_id"),
            @JoinColumn(name = "accept_position", nullable = false, referencedColumnName = "position"),
            @JoinColumn(name = "accept_electiondate", nullable = false, referencedColumnName = "election_date")
    })
    private Officer acceptOfficer;

    /*@Column(name = "accept_position", length = 45)
    private String acceptPosition;

    @Column(name = "accept_electiondate")
    private LocalDate acceptElectiondate;*/

    @Column(name = "return_date")
    private LocalDate returnDate;

    public AssetRentalId getId() {
        return id;
    }

    public void setId(AssetRentalId id) {
        this.id = id;
    }

    public AssetTransaction getAsset() {
        return asset;
    }

    public void setAsset(AssetTransaction asset) {
        this.asset = asset;
    }

    public LocalDate getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(LocalDate reservationDate) {
        this.reservationDate = reservationDate;
    }

    public Resident getResident() {
        return resident;
    }

    public void setResident(Resident resident) {
        this.resident = resident;
    }

    public BigDecimal getRentalAmount() {
        return rentalAmount;
    }

    public void setRentalAmount(BigDecimal rentalAmount) {
        this.rentalAmount = rentalAmount;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getInspectionDetails() {
        return inspectionDetails;
    }

    public void setInspectionDetails(String inspectionDetails) {
        this.inspectionDetails = inspectionDetails;
    }

    public BigDecimal getAssessedValue() {
        return assessedValue;
    }

    public void setAssessedValue(BigDecimal assessedValue) {
        this.assessedValue = assessedValue;
    }

    public Officer getAcceptOfficer() {
        return acceptOfficer;
    }

    public void setAcceptOfficer(Officer acceptOfficer) {
        this.acceptOfficer = acceptOfficer;
    }

    /*public String getAcceptPosition() {
        return acceptPosition;
    }

    public void setAcceptPosition(String acceptPosition) {
        this.acceptPosition = acceptPosition;
    }

    public LocalDate getAcceptElectiondate() {
        return acceptElectiondate;
    }

    public void setAcceptElectiondate(LocalDate acceptElectiondate) {
        this.acceptElectiondate = acceptElectiondate;
    }*/

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

}