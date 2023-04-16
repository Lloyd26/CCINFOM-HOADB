package ccinfom.hoa.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "elections")
public class Election {
    @Id
    @Temporal(TemporalType.DATE)
    @Column(name = "election_date", nullable = false)
    private LocalDate id;

    @Column(name = "election_venue", nullable = false, length = 45)
    private String electionVenue;

    @Column(name = "quorum", nullable = false)
    private Boolean quorum = false;

    public LocalDate getId() {
        return id;
    }

    public void setId(LocalDate id) {
        this.id = id;
    }

    public String getElectionVenue() {
        return electionVenue;
    }

    public void setElectionVenue(String electionVenue) {
        this.electionVenue = electionVenue;
    }

    public Boolean getQuorum() {
        return quorum;
    }

    public void setQuorum(Boolean quorum) {
        this.quorum = quorum;
    }

}