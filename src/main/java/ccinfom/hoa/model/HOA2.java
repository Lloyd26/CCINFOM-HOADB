package ccinfom.hoa.model;

import jakarta.persistence.*;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.util.Date;

@Entity
@Table
public class HOA2 {
    @Id
    @Column(name = "hoa_name", nullable = false, length = 45)
    private String hoaName;

    @Column(name = "ofcaddr_streetno", length = 10)
    private String officeAddressStreetNumber;

    @Column(name = "ofcaddr_street", length = 45)
    private String officeAddressStreet;

    /*@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ofcaddr_barangay", referencedColumnName = "barangay", nullable = false)
    //@JoinColumn(name = "FKNORM08", referencedColumnName = "barangay", nullable = false)
    private Zipcode officeAddressBarangay;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ofcaddr_city", referencedColumnName = "city", nullable = false)
    //@JoinColumn(name = "FKNORM08", referencedColumnName = "city", nullable = false)
    private Zipcode officeAddressCity;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ofcaddr_province", referencedColumnName = "province", nullable = false)
    //@JoinColumn(name = "FKNORM08", referencedColumnName = "province", nullable = false)
    private Zipcode officeAddressProvince;*/

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumns({
            @JoinColumn(name = "ofcaddr_barangay", referencedColumnName = "barangay", nullable = false),
            @JoinColumn(name = "ofcaddr_city", referencedColumnName = "city", nullable = false),
            @JoinColumn(name = "ofcaddr_province", referencedColumnName = "province", nullable = false)
    })
    private Zipcode zipcode;


    @Column(name = "ofcaddr_lattitude", nullable = false,
            precision = 7, scale = 4)
    @JdbcTypeCode(SqlTypes.DECIMAL)
    private Float officeAddressLatitude;

    @Column(name = "ofcaddr_longitude", nullable = false,
            precision = 7, scale = 2)
    @JdbcTypeCode(SqlTypes.DECIMAL)
    private Float officeAddressLongitude;

    @Temporal(TemporalType.DATE)
    @Column(name = "year_establishment", nullable = false)
    private Date yearEstablishment;

    @Column(name = "website", length = 45)
    private String website;

    @Column(name = "subdivision_name", nullable = false, length = 45)
    private String subdivisionName;

    @Column(name = "req_scannedarticles", length = 45)
    private String reqScannedArticles;

    @Column(name = "req_notarizedbylaws", length = 45)
    private String reqNotarizedByLaws;

    @Column(name = "req_minutes", length = 45)
    private String reqMinutes;

    @Column(name = "req_attendance", length = 45)
    private String reqAttendance;

    @Column(name = "req_certification", length = 45)
    private String reqCertification;

    @Column(name = "req_codeofethics", length = 45)
    private String reqCodeOfEthics;

    @Column(name = "req_regularmonthly",
            precision = 9, scale = 2)
    @JdbcTypeCode(SqlTypes.DECIMAL)
    private Float reqRegularMonthly;

    @Column(name = "req_collectionday")
    private Integer reqCollectionDay;
    public Integer getReqCollectionDay() {
        return reqCollectionDay;
    }

    public void setReqCollectionDay(Integer reqCollectionDay) {
        this.reqCollectionDay = reqCollectionDay;
    }

    public Float getReqRegularMonthly() {
        return reqRegularMonthly;
    }

    public void setReqRegularMonthly(Float reqRegularMonthly) {
        this.reqRegularMonthly = reqRegularMonthly;
    }

    public String getReqCodeOfEthics() {
        return reqCodeOfEthics;
    }

    public void setReqCodeOfEthics(String reqCodeOfEthics) {
        this.reqCodeOfEthics = reqCodeOfEthics;
    }

    public String getReqCertification() {
        return reqCertification;
    }

    public void setReqCertification(String reqCertification) {
        this.reqCertification = reqCertification;
    }

    public String getReqAttendance() {
        return reqAttendance;
    }

    public void setReqAttendance(String reqAttendance) {
        this.reqAttendance = reqAttendance;
    }

    public String getReqMinutes() {
        return reqMinutes;
    }

    public void setReqMinutes(String reqMinutes) {
        this.reqMinutes = reqMinutes;
    }

    public String getReqNotarizedByLaws() {
        return reqNotarizedByLaws;
    }

    public void setReqNotarizedByLaws(String reqNotarizedByLaws) {
        this.reqNotarizedByLaws = reqNotarizedByLaws;
    }

    public String getReqScannedArticles() {
        return reqScannedArticles;
    }

    public void setReqScannedArticles(String reqScannedArticles) {
        this.reqScannedArticles = reqScannedArticles;
    }

    public String getSubdivisionName() {
        return subdivisionName;
    }

    public void setSubdivisionName(String subdivisionName) {
        this.subdivisionName = subdivisionName;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public Date getYearEstablishment() {
        return yearEstablishment;
    }

    public void setYearEstablishment(Date yearEstablishment) {
        this.yearEstablishment = yearEstablishment;
    }

    public Float getOfficeAddressLongitude() {
        return officeAddressLongitude;
    }

    public void setOfficeAddressLongitude(Float officeAddressLongitude) {
        this.officeAddressLongitude = officeAddressLongitude;
    }

    public Float getOfficeAddressLatitude() {
        return officeAddressLatitude;
    }

    public void setOfficeAddressLatitude(Float officeAddressLatitude) {
        this.officeAddressLatitude = officeAddressLatitude;
    }

    public Zipcode getZipcode() {
        return zipcode;
    }

    public void setZipcode(Zipcode zipcode) {
        this.zipcode = zipcode;
    }

    /*public Zipcode getOfficeAddressProvince() {
        return officeAddressProvince;
    }

    public void setOfficeAddressProvince(Zipcode officeAddressProvince) {
        this.officeAddressProvince = officeAddressProvince;
    }

    public Zipcode getOfficeAddressCity() {
        return officeAddressCity;
    }

    public void setOfficeAddressCity(Zipcode officeAddressCity) {
        this.officeAddressCity = officeAddressCity;
    }

    public Zipcode getOfficeAddressBarangay() {
        return officeAddressBarangay;
    }

    public void setOfficeAddressBarangay(Zipcode officeAddressBarangay) {
        this.officeAddressBarangay = officeAddressBarangay;
    }*/

    public String getOfficeAddressStreet() {
        return officeAddressStreet;
    }

    public void setOfficeAddressStreet(String officeAddressStreet) {
        this.officeAddressStreet = officeAddressStreet;
    }

    public String getOfficeAddressStreetNumber() {
        return officeAddressStreetNumber;
    }

    public void setOfficeAddressStreetNumber(String officeAddressStreetNumber) {
        this.officeAddressStreetNumber = officeAddressStreetNumber;
    }

    public String getHoaName() {
        return hoaName;
    }

    public void setHoaName(String hoaName) {
        this.hoaName = hoaName;
    }
}
