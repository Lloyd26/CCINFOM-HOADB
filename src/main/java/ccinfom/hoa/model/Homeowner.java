package ccinfom.hoa.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table
@SecondaryTable(name = "people")
public class Homeowner {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ho_id")
    private Integer homeownerID;

    @OneToOne
    @PrimaryKeyJoinColumn(name = "ho_id", referencedColumnName = "peopleid")
    private People people;

    @Column(name = "hostart_date")
    private Date homeownerStartDate;

    @Column(name = "undertaking")
    private Boolean undertaking;

    @Column(name = "want_member")
    private Boolean wantMember;

    @Column(name = "other_streetno",
            length = 45)
    private String otherStreetNumber;

    @Column(name = "other_street",
            length = 45)
    private String otherStreet;

    @Column(name = "other_barangay",
            length = 45)
    private String otherBarangay;

    @Column(name = "other_city",
            length = 45)
    private String otherCity;

    @Column(name = "other_province",
            length = 45)
    private String otherProvince;

    @Column(name = "other_longitude",
            columnDefinition = "DECIMAL",
            precision = 7, scale = 4)
    private Float otherLongitude;

    @Column(name = "other_latitude",
            columnDefinition = "DECIMAL",
            precision = 7, scale = 4)
    private Float otherLatitude;

    @Column(name = "other_email",
            length = 45,
            unique = true)
    private String otherEmail;

    @Column(name = "other_mobile",
            length = 45,
            unique = true)
    private String otherMobile;

    public Integer getHomeownerID() {
        return homeownerID;
    }

    public void setHomeownerID(Integer homeownerID) {
        this.homeownerID = homeownerID;
    }

    public People getPeople() {
        return people;
    }

    public void setPeople(People people) {
        this.people = people;
    }

    public Date getHomeownerStartDate() {
        return homeownerStartDate;
    }

    public void setHomeownerStartDate(Date homeownerStartDate) {
        this.homeownerStartDate = homeownerStartDate;
    }

    public Boolean getUndertaking() {
        return undertaking;
    }

    public void setUndertaking(Boolean undertaking) {
        this.undertaking = undertaking;
    }

    public Boolean getWantMember() {
        return wantMember;
    }

    public void setWantMember(Boolean wantMember) {
        this.wantMember = wantMember;
    }

    public String getOtherStreetNumber() {
        return otherStreetNumber;
    }

    public void setOtherStreetNumber(String otherStreetNumber) {
        this.otherStreetNumber = otherStreetNumber;
    }

    public String getOtherStreet() {
        return otherStreet;
    }

    public void setOtherStreet(String otherStreet) {
        this.otherStreet = otherStreet;
    }

    public String getOtherBarangay() {
        return otherBarangay;
    }

    public void setOtherBarangay(String otherBarangay) {
        this.otherBarangay = otherBarangay;
    }

    public String getOtherCity() {
        return otherCity;
    }

    public void setOtherCity(String otherCity) {
        this.otherCity = otherCity;
    }

    public String getOtherProvince() {
        return otherProvince;
    }

    public void setOtherProvince(String otherProvince) {
        this.otherProvince = otherProvince;
    }

    public Float getOtherLongitude() {
        return otherLongitude;
    }

    public void setOtherLongitude(Float otherLongitude) {
        this.otherLongitude = otherLongitude;
    }

    public Float getOtherLatitude() {
        return otherLatitude;
    }

    public void setOtherLatitude(Float otherLatitude) {
        this.otherLatitude = otherLatitude;
    }

    public String getOtherEmail() {
        return otherEmail;
    }

    public void setOtherEmail(String otherEmail) {
        this.otherEmail = otherEmail;
    }

    public String getOtherMobile() {
        return otherMobile;
    }

    public void setOtherMobile(String otherMobile) {
        this.otherMobile = otherMobile;
    }

    public Homeowner() {
    }

    public Homeowner(Date homeownerStartDate, Boolean undertaking, Boolean wantMember, String otherStreetNumber, String otherStreet, String otherBarangay, String otherCity, String otherProvince, Float otherLongitude, Float otherLatitude, String otherEmail, String otherMobile) {
        this.homeownerStartDate = homeownerStartDate;
        this.undertaking = undertaking;
        this.wantMember = wantMember;
        this.otherStreetNumber = otherStreetNumber;
        this.otherStreet = otherStreet;
        this.otherBarangay = otherBarangay;
        this.otherCity = otherCity;
        this.otherProvince = otherProvince;
        this.otherLongitude = otherLongitude;
        this.otherLatitude = otherLatitude;
        this.otherEmail = otherEmail;
        this.otherMobile = otherMobile;
    }
}
