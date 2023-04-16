package ccinfom.hoa.model;

import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Entity
@Table(name = "officer")
public class Officer {

    @Id
    @Column(name = "ho_id", nullable = false)
    private Homeowner id;

    @Id
    @Column(name = "position", nullable = false, length = 45)
    private RefPositions position;

    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "start_date", nullable = false)
    private Date startDate;

    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "end_date", nullable = false)
    private Date endDate;

    @Id
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "election_date", nullable = false)
    private Elections electionDate;

    @Column(columnDefinition = "ENUM('M', 'A')", nullable = false)
    @Enumerated(EnumType.STRING)
    private Character availability_time;

    @Column(name = "M", nullable = false)
    private Boolean m;

    @Column(name = "T", nullable = false)
    private Boolean t;

    @Column(name = "W", nullable = false)
    private Boolean w;

    @Column(name = "H", nullable = false)
    private Boolean h;

    @Column(name = "F", nullable = false)
    private Boolean f;

    @Column(name = "S", nullable = false)
    private Boolean s;

    @Column(name = "N", nullable = false)
    private Boolean n;

    public Homeowner getId() {
        return id;
    }

    public void setId(Homeowner id) {
        this.id = id;
    }

    public RefPositions getPosition() {
        return position;
    }

    public void setPosition(RefPositions position) {
        this.position = position;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Elections getElectionDate() {
        return electionDate;
    }

    public void setElectionDate(Elections electionDate) {
        this.electionDate = electionDate;
    }

    public Character getAvailability_time() {
        return availability_time;
    }

    public void setAvailability_time(Character availability_time) {
        this.availability_time = availability_time;
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
}
