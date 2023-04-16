package ccinfom.hoa.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "asset_donations")
public class AssetDonation {
    @Id
    @Column(name = "donation_id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "donor_completename", nullable = false)
    private Donor donorCompletename;

    @Column(name = "donation_formfile", length = 45)
    private String donationFormfile;

    @Column(name = "date_donation", nullable = false)
    private LocalDate dateDonation;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumns({
            @JoinColumn(name = "accept_hoid", nullable = false, referencedColumnName = "ho_id"),
            @JoinColumn(name = "accept_position", nullable = false, referencedColumnName = "position"),
            @JoinColumn(name = "accept_electiondate", nullable = false, referencedColumnName = "election_date")
    })
    private Officer acceptOfficer;

    /*@Column(name = "accept_position", nullable = false, length = 45)
    private String acceptPosition;

    @Column(name = "accept_electiondate", nullable = false)
    private LocalDate acceptElectiondate;*/

    @Column(name = "isdeleted", nullable = false)
    private Boolean isdeleted = false;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
            @JoinColumn(name = "approval_hoid", referencedColumnName = "ho_id"),
            @JoinColumn(name = "approval_position", referencedColumnName = "position"),
            @JoinColumn(name = "approval_electiondate", referencedColumnName = "election_date")
    })
    private OfficerPresident approvalOfficer;

    /*@Column(name = "approval_position", length = 45)
    private String approvalPosition;

    @Column(name = "approval_electiondate")
    private LocalDate approvalElectiondate;*/

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Donor getDonorCompletename() {
        return donorCompletename;
    }

    public void setDonorCompletename(Donor donorCompletename) {
        this.donorCompletename = donorCompletename;
    }

    public String getDonationFormfile() {
        return donationFormfile;
    }

    public void setDonationFormfile(String donationFormfile) {
        this.donationFormfile = donationFormfile;
    }

    public LocalDate getDateDonation() {
        return dateDonation;
    }

    public void setDateDonation(LocalDate dateDonation) {
        this.dateDonation = dateDonation;
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

    public Boolean getIsdeleted() {
        return isdeleted;
    }

    public void setIsdeleted(Boolean isdeleted) {
        this.isdeleted = isdeleted;
    }

    public OfficerPresident getApprovalOfficer() {
        return approvalOfficer;
    }

    public void setApprovalOfficer(OfficerPresident approvalOfficer) {
        this.approvalOfficer = approvalOfficer;
    }

    /*public String getApprovalPosition() {
        return approvalPosition;
    }

    public void setApprovalPosition(String approvalPosition) {
        this.approvalPosition = approvalPosition;
    }

    public LocalDate getApprovalElectiondate() {
        return approvalElectiondate;
    }

    public void setApprovalElectiondate(LocalDate approvalElectiondate) {
        this.approvalElectiondate = approvalElectiondate;
    }*/

}