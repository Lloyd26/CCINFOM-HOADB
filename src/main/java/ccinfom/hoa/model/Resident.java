package ccinfom.hoa.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "residents")
public class Resident {
    @Id
    @Column(name = "resident_id", nullable = false)
    private Integer id;

    @MapsId
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "resident_id", nullable = false)
    private People people;

    @Column(name = "renter", nullable = false)
    private Boolean renter = false;

    @Column(name = "relationship", nullable = false, length = 45)
    private String relationship;

    @Column(name = "undertaking", nullable = false)
    private Boolean undertaking = false;

    @Lob
    @Column(name = "authorized", nullable = false)
    private String authorized;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "household_id")
    private Household household;

    @Column(name = "last_update", nullable = false)
    private LocalDate lastUpdate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public People getPeople() {
        return people;
    }

    public void setPeople(People people) {
        this.people = people;
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

    public Boolean getUndertaking() {
        return undertaking;
    }

    public void setUndertaking(Boolean undertaking) {
        this.undertaking = undertaking;
    }

    public String getAuthorized() {
        return authorized;
    }

    public void setAuthorized(String authorized) {
        this.authorized = authorized;
    }

    public Household getHousehold() {
        return household;
    }

    public void setHousehold(Household household) {
        this.household = household;
    }

    public LocalDate getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(LocalDate lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

}