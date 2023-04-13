package ccinfom.hoa.model;

import jakarta.persistence.*;

import java.math.BigInteger;

@Entity
@Table(name = "people_mobile")
public class PeopleMobileNumber {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "peopleid")
    private People peopleID;

    @Id
    @Column(name = "mobileno",
            columnDefinition = "BIGINT")
    private Long mobileNumber;

    public People getPeopleID() {
        return peopleID;
    }

    public void setPeopleID(People peopleID) {
        this.peopleID = peopleID;
    }

    public Long getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(Long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public PeopleMobileNumber() {}

    public PeopleMobileNumber(People peopleID, Long mobileNumber) {
        this.peopleID = peopleID;
        this.mobileNumber = mobileNumber;
    }
}
