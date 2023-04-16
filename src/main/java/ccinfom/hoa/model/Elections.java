package ccinfom.hoa.model;

import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Entity
@Table(name = "elections")
public class Elections {

    @Id
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "election_date", nullable = false)
    private Date electionDate;

    @Column(name = "election_venue", nullable = false, length = 45)
    private String electionVenue;

    @Column(name = "quorum", nullable = false)
    private Boolean qurum;

    @Column(name = "outsider_wname", nullable = false, length = 45)
    private Outsiders outsiderWname;

    public Date getElectionDate() {
        return electionDate;
    }

    public void setElectionDate(Date electionDate) {
        this.electionDate = electionDate;
    }

    public String getElectionVenue() {
        return electionVenue;
    }

    public void setElectionVenue(String electionVenue) {
        this.electionVenue = electionVenue;
    }

    public Boolean getQurum() {
        return qurum;
    }

    public void setQurum(Boolean qurum) {
        this.qurum = qurum;
    }

    public Outsiders getOutsiderWname() {
        return outsiderWname;
    }

    public void setOutsiderWname(Outsiders outsiderWname) {
        this.outsiderWname = outsiderWname;
    }
}
