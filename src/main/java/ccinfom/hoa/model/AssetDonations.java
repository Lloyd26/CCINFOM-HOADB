package ccinfom.hoa.model;

import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Entity
@Table(name = "asset_donations")
public class AssetDonations {

    @Id
    @Column(name = "donation_id", nullable = false)
    private Integer id;

    @Column(name = "donor_completename", nullable = false, length = 45)
    private Donors donorCompleteName;

    @Column(name = "donor_formfile", length = 45)
    private String donorFormFile;

    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "date_donation", nullable = false)
    private Date dateDonation;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumns({
            @JoinColumn(name = "accept_hoid", referencedColumnName = "ho_id", nullable = false),
            @JoinColumn(name = "accept_position", referencedColumnName = "position", nullable = false),
            @JoinColumn(name = "accept_electiondate", referencedColumnName = "election_date", nullable = false)
    })
    private Officer officer;

    @Column(name = "isDeleted", nullable = false)
    private Boolean isDeleted;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumns({
            @JoinColumn(name = "approval_hoid", referencedColumnName = "ho_id"),
            @JoinColumn(name = "approval_position", referencedColumnName = "position"),
            @JoinColumn(name = "approval_electiondate", referencedColumnName = "election_date")
    })
    private OfficerPresidents officerPresidents;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Donors getDonorCompleteName() {
        return donorCompleteName;
    }

    public void setDonorCompleteName(Donors donorCompleteName) {
        this.donorCompleteName = donorCompleteName;
    }

    public String getDonorFormFile() {
        return donorFormFile;
    }

    public void setDonorFormFile(String donorFormFile) {
        this.donorFormFile = donorFormFile;
    }

    public Date getDateDonation() {
        return dateDonation;
    }

    public void setDateDonation(Date dateDonation) {
        this.dateDonation = dateDonation;
    }

    public Officer getOfficer() {
        return officer;
    }

    public void setOfficer(Officer officer) {
        this.officer = officer;
    }

    public Boolean getDeleted() {
        return isDeleted;
    }

    public void setDeleted(Boolean deleted) {
        isDeleted = deleted;
    }

    public OfficerPresidents getOfficerPresidents() {
        return officerPresidents;
    }

    public void setOfficerPresidents(OfficerPresidents officerPresidents) {
        this.officerPresidents = officerPresidents;
    }
}
