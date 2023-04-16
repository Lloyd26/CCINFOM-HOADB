package ccinfom.hoa.model;

import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Entity
@Table(name = "asset_transactions")
public class AssetTransactions {

    @Id
    @Column(name = "asset_id", nullable = false)
    private Assets id;

    @Id
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "transaction_date", nullable = false)
    private Date transaction_date;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumns({
            @JoinColumn(name = "trans_hoid", referencedColumnName = "ho_id", nullable = false),
            @JoinColumn(name = "trans_position", referencedColumnName = "position", nullable = false),
            @JoinColumn(name = "trans_electiondate", referencedColumnName = "election_date", nullable = false)
    })
    private Officer officer;

    @Column(name = "isdeleted", nullable = false)
    private Boolean isDeleted;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumns({
            @JoinColumn(name = "approval_hoid", referencedColumnName = "ho_id"),
            @JoinColumn(name = "approval_position", referencedColumnName = "position"),
            @JoinColumn(name = "approval_electiondate", referencedColumnName = "election_date")
    })
    private OfficerPresidents officerPresidents;

    @Column(name = "ornum", unique = true)
    private RefOrnumbers orNum;

    @Column(columnDefinition = "ENUM('R', 'T', 'A')", nullable = false)
    @Enumerated(EnumType.STRING)
    private Character transaction_type;

    public Assets getId() {
        return id;
    }

    public void setId(Assets id) {
        this.id = id;
    }

    public Date getTransaction_date() {
        return transaction_date;
    }

    public void setTransaction_date(Date transaction_date) {
        this.transaction_date = transaction_date;
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

    public RefOrnumbers getOrNum() {
        return orNum;
    }

    public void setOrNum(RefOrnumbers orNum) {
        this.orNum = orNum;
    }

    public Character getTransaction_type() {
        return transaction_type;
    }

    public void setTransaction_type(Character transaction_type) {
        this.transaction_type = transaction_type;
    }
}
