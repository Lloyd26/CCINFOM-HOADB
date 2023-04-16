package ccinfom.hoa.model;

import ccinfom.hoa.model.id.AssetTransactionId;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "asset_transactions")
public class AssetTransaction {
    @EmbeddedId
    private AssetTransactionId id;

    @MapsId("asset_id")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "asset_id", nullable = false)
    private Asset asset;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumns({
            @JoinColumn(name = "trans_hoid", nullable = false, referencedColumnName = "ho_id"),
            @JoinColumn(name = "trans_position", nullable = false, referencedColumnName = "position"),
            @JoinColumn(name = "trans_electiondate", nullable = false, referencedColumnName = "election_date")
    })
    private Officer transOfficer;

    /*@Column(name = "trans_position", nullable = false, length = 45)
    private String transPosition;

    @Column(name = "trans_electiondate", nullable = false)
    private LocalDate transElectiondate;*/

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

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ornum")
    private RefOrnumber ornum;

    @Lob
    @Column(name = "transaction_type", nullable = false)
    private String transactionType;

    public AssetTransactionId getId() {
        return id;
    }

    public void setId(AssetTransactionId id) {
        this.id = id;
    }

    public Asset getAsset() {
        return asset;
    }

    public void setAsset(Asset asset) {
        this.asset = asset;
    }

    public Officer getTransOfficer() {
        return transOfficer;
    }

    public void setTransOfficer(Officer transOfficer) {
        this.transOfficer = transOfficer;
    }

    /*public String getTransPosition() {
        return transPosition;
    }

    public void setTransPosition(String transPosition) {
        this.transPosition = transPosition;
    }

    public LocalDate getTransElectiondate() {
        return transElectiondate;
    }

    public void setTransElectiondate(LocalDate transElectiondate) {
        this.transElectiondate = transElectiondate;
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

    public RefOrnumber getOrnum() {
        return ornum;
    }

    public void setOrnum(RefOrnumber ornum) {
        this.ornum = ornum;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

}