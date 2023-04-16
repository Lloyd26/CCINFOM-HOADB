package ccinfom.hoa.model;

import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Entity
@Table(name = "residents")
public class Residents {

    @Id
    @Column(name = "resident_id", nullable = false)
    private People id;

    @Column(name = "renter", nullable = false)
    private Boolean renter;

    @Column(name = "relationship", nullable = false, length = 45)
    private String relationship;

    @Column(name = "undertaking", nullable = false)
    private Boolean underTaking;

    @Column(columnDefinition = "ENUM('Yes', 'No')", nullable = false)
    @Enumerated(EnumType.STRING)
    private String authorized;

    @Column(name = "household_id")
    private Household householdID;

    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "last_update", nullable = false)
    private Date lastUpdate;

    public People getId() {
        return id;
    }

    public void setId(People id) {
        this.id = id;
    }

    public Boolean getRenter() {
        return renter;
    }

    public void setRenter(Boolean renter) {
        this.renter = renter;
    }

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    public Boolean getUnderTaking() {
        return underTaking;
    }

    public void setUnderTaking(Boolean underTaking) {
        this.underTaking = underTaking;
    }

    public String getAuthorized() {
        return authorized;
    }

    public void setAuthorized(String authorized) {
        this.authorized = authorized;
    }

    public Household getHouseholdID() {
        return householdID;
    }

    public void setHouseholdID(Household householdID) {
        this.householdID = householdID;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
}
