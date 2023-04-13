package ccinfom.hoa.model;

import jakarta.persistence.*;

@Entity
@Table
public class Household {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "household_id", nullable = false)
    private Integer householdID;

    public Integer getHouseholdID() {
        return householdID;
    }

    public void setHouseholdID(Integer householdID) {
        this.householdID = householdID;
    }
}
