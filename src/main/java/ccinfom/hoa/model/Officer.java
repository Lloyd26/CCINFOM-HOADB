package ccinfom.hoa.model;

import ccinfom.hoa.model.id.OfficerId;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "officer")
public class Officer {
    @EmbeddedId
    private OfficerId id;

    @MapsId("homeownerID")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ho_id", nullable = false)
    private Homeowner ho;

    @MapsId("position")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "position", nullable = false)
    private RefPosition position;

    @MapsId("electionDate")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "election_date", nullable = false)
    private Election electionDate;

    @Column(name = "start_date", nullable = false)
    private LocalDate startDate;

    @Column(name = "end_date", nullable = false)
    private LocalDate endDate;

    @Lob
    @Column(name = "availability_time", nullable = false)
    private String availabilityTime;

    @Column(name = "M", nullable = false)
    private Boolean m = false;

    @Column(name = "T", nullable = false)
    private Boolean t = false;

    @Column(name = "W", nullable = false)
    private Boolean w = false;

    @Column(name = "H", nullable = false)
    private Boolean h = false;

    @Column(name = "F", nullable = false)
    private Boolean f = false;

    @Column(name = "S", nullable = false)
    private Boolean s = false;

    @Column(name = "N", nullable = false)
    private Boolean n = false;

    @OneToMany(mappedBy = "officer")
    private Set<OfficerPresident> officerPresidents = new LinkedHashSet<>();

    public OfficerId getId() {
        return id;
    }

    public void setId(OfficerId id) {
        this.id = id;
    }

    public Homeowner getHo() {
        return ho;
    }

    public void setHo(Homeowner ho) {
        this.ho = ho;
    }

    public RefPosition getPosition() {
        return position;
    }

    public void setPosition(RefPosition position) {
        this.position = position;
    }

    public Election getElectionDate() {
        return electionDate;
    }

    public void setElectionDate(Election electionDate) {
        this.electionDate = electionDate;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public String getAvailabilityTime() {
        return availabilityTime;
    }

    public void setAvailabilityTime(String availabilityTime) {
        this.availabilityTime = availabilityTime;
    }

    public Boolean getM() {
        return m;
    }

    public void setM(Boolean m) {
        this.m = m;
    }

    public Boolean getT() {
        return t;
    }

    public void setT(Boolean t) {
        this.t = t;
    }

    public Boolean getW() {
        return w;
    }

    public void setW(Boolean w) {
        this.w = w;
    }

    public Boolean getH() {
        return h;
    }

    public void setH(Boolean h) {
        this.h = h;
    }

    public Boolean getF() {
        return f;
    }

    public void setF(Boolean f) {
        this.f = f;
    }

    public Boolean getS() {
        return s;
    }

    public void setS(Boolean s) {
        this.s = s;
    }

    public Boolean getN() {
        return n;
    }

    public void setN(Boolean n) {
        this.n = n;
    }

    public Set<OfficerPresident> getOfficerPresidents() {
        return officerPresidents;
    }

    public void setOfficerPresidents(Set<OfficerPresident> officerPresidents) {
        this.officerPresidents = officerPresidents;
    }

}