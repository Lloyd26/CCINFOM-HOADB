package ccinfom.hoa.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "hoa")
public class Hoa {
    @Id
    @Column(name = "hoa_name", nullable = false, length = 45)
    private String id;

    @Column(name = "ofcaddr_streetno", nullable = false, length = 10)
    private String ofcaddrStreetno;

    @Column(name = "ofcaddr_street", nullable = false, length = 45)
    private String ofcaddrStreet;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumns({
            @JoinColumn(name = "ofcaddr_barangay", referencedColumnName = "barangay", nullable = false),
            @JoinColumn(name = "ofcaddr_city", referencedColumnName = "city", nullable = false),
            @JoinColumn(name = "ofcaddr_province", referencedColumnName = "province", nullable = false)
    })
    private Zipcode zipcode;

    /*@ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ofcaddr_barangay", nullable = false, referencedColumnName = "barangay")
    private Zipcode zipcode;*/

    /*@Column(name = "ofcaddr_city", nullable = false, length = 45)
    private String ofcaddrCity;

    @Column(name = "ofcaddr_province", nullable = false, length = 45)
    private String ofcaddrProvince;*/

    @Column(name = "ofcaddr_lattitude", nullable = false, precision = 7, scale = 4)
    private BigDecimal ofcaddrLattitude;

    @Column(name = "ofcaddr_longitude", nullable = false, precision = 7, scale = 2)
    private BigDecimal ofcaddrLongitude;

    @Column(name = "year_establishment", nullable = false)
    private LocalDate yearEstablishment;

    @Column(name = "website", length = 45)
    private String website;

    @Column(name = "subdivision_name", nullable = false, length = 45)
    private String subdivisionName;

    @Column(name = "req_scannedarticles", length = 45)
    private String reqScannedarticles;

    @Column(name = "req_notarizedbylaws", length = 45)
    private String reqNotarizedbylaws;

    @Column(name = "req_minutes", length = 45)
    private String reqMinutes;

    @Column(name = "req_attendance", length = 45)
    private String reqAttendance;

    @Column(name = "req_certification", length = 45)
    private String reqCertification;

    @Column(name = "req_codeofethics", length = 45)
    private String reqCodeofethics;

    @Column(name = "req_regularmonthly", precision = 9, scale = 2)
    private BigDecimal reqRegularmonthly;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "req_collectionday", nullable = false)
    private RefCollectionday reqCollectionday;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOfcaddrStreetno() {
        return ofcaddrStreetno;
    }

    public void setOfcaddrStreetno(String ofcaddrStreetno) {
        this.ofcaddrStreetno = ofcaddrStreetno;
    }

    public String getOfcaddrStreet() {
        return ofcaddrStreet;
    }

    public void setOfcaddrStreet(String ofcaddrStreet) {
        this.ofcaddrStreet = ofcaddrStreet;
    }

    public Zipcode getZipcode() {
        return zipcode;
    }

    public void setZipcode(Zipcode zipcode) {
        this.zipcode = zipcode;
    }

    /*public String getOfcaddrCity() {
        return ofcaddrCity;
    }

    public void setOfcaddrCity(String ofcaddrCity) {
        this.ofcaddrCity = ofcaddrCity;
    }

    public String getOfcaddrProvince() {
        return ofcaddrProvince;
    }

    public void setOfcaddrProvince(String ofcaddrProvince) {
        this.ofcaddrProvince = ofcaddrProvince;
    }*/

    public BigDecimal getOfcaddrLattitude() {
        return ofcaddrLattitude;
    }

    public void setOfcaddrLattitude(BigDecimal ofcaddrLattitude) {
        this.ofcaddrLattitude = ofcaddrLattitude;
    }

    public BigDecimal getOfcaddrLongitude() {
        return ofcaddrLongitude;
    }

    public void setOfcaddrLongitude(BigDecimal ofcaddrLongitude) {
        this.ofcaddrLongitude = ofcaddrLongitude;
    }

    public LocalDate getYearEstablishment() {
        return yearEstablishment;
    }

    public void setYearEstablishment(LocalDate yearEstablishment) {
        this.yearEstablishment = yearEstablishment;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getSubdivisionName() {
        return subdivisionName;
    }

    public void setSubdivisionName(String subdivisionName) {
        this.subdivisionName = subdivisionName;
    }

    public String getReqScannedarticles() {
        return reqScannedarticles;
    }

    public void setReqScannedarticles(String reqScannedarticles) {
        this.reqScannedarticles = reqScannedarticles;
    }

    public String getReqNotarizedbylaws() {
        return reqNotarizedbylaws;
    }

    public void setReqNotarizedbylaws(String reqNotarizedbylaws) {
        this.reqNotarizedbylaws = reqNotarizedbylaws;
    }

    public String getReqMinutes() {
        return reqMinutes;
    }

    public void setReqMinutes(String reqMinutes) {
        this.reqMinutes = reqMinutes;
    }

    public String getReqAttendance() {
        return reqAttendance;
    }

    public void setReqAttendance(String reqAttendance) {
        this.reqAttendance = reqAttendance;
    }

    public String getReqCertification() {
        return reqCertification;
    }

    public void setReqCertification(String reqCertification) {
        this.reqCertification = reqCertification;
    }

    public String getReqCodeofethics() {
        return reqCodeofethics;
    }

    public void setReqCodeofethics(String reqCodeofethics) {
        this.reqCodeofethics = reqCodeofethics;
    }

    public BigDecimal getReqRegularmonthly() {
        return reqRegularmonthly;
    }

    public void setReqRegularmonthly(BigDecimal reqRegularmonthly) {
        this.reqRegularmonthly = reqRegularmonthly;
    }

    public RefCollectionday getReqCollectionday() {
        return reqCollectionday;
    }

    public void setReqCollectionday(RefCollectionday reqCollectionday) {
        this.reqCollectionday = reqCollectionday;
    }

}