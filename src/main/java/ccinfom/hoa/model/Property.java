package ccinfom.hoa.model;

import jakarta.persistence.*;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.io.Serializable;

@Entity
@Table(name = "properties")
@IdClass(Property.class)
public class Property implements Serializable {
    @Id
    @Column(name = "property_code", nullable = false, length = 10)
    private String propertyCode;

    @Id
    @OneToOne(optional = false, orphanRemoval = true)
    @JoinColumn(name = "hoa_name", referencedColumnName = "hoa_name", nullable = false)
    private HOA2 hoaName;

    @Column(name = "size", nullable = false,
            precision = 6, scale = 2)
    @JdbcTypeCode(SqlTypes.DECIMAL)
    private Float size;

    @OneToOne
    @JoinColumn(name = "ho_id")
    private Homeowner homeownerID;

    @OneToOne
    @JoinColumn(name = "household_id", unique = true)
    private Household householdID;

    public Household getHouseholdID() {
        return householdID;
    }

    public void setHouseholdID(Household householdID) {
        this.householdID = householdID;
    }

    public Homeowner getHomeownerID() {
        return homeownerID;
    }

    public void setHomeownerID(Homeowner homeownerID) {
        this.homeownerID = homeownerID;
    }

    public Float getSize() {
        return size;
    }

    public void setSize(Float size) {
        this.size = size;
    }

    public HOA2 getHoaName() {
        return hoaName;
    }

    public void setHoaName(HOA2 hoaName) {
        this.hoaName = hoaName;
    }

    public String getPropertyCode() {
        return propertyCode;
    }

    public void setPropertyCode(String propertyCode) {
        this.propertyCode = propertyCode;
    }
}
