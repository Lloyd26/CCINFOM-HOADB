package ccinfom.hoa.model;

import jakarta.persistence.*;

@Entity
@Table(name = "officer_presidents")
public class OfficerPresidents {

    @Id
    @Column(name = "ho_id", nullable = false)
    private Officer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumns({
            @JoinColumn(name = "ho_id", referencedColumnName = "ho_id", nullable = false),
            @JoinColumn(name = "position", referencedColumnName = "position", nullable = false),
            @JoinColumn(name = "election_date", referencedColumnName = "election_date", nullable = false)
    })
    private Officer officer;

    public Officer getId() {
        return id;
    }

    public void setId(Officer id) {
        this.id = id;
    }

    public Officer getOfficer() {
        return officer;
    }

    public void setOfficer(Officer officer) {
        this.officer = officer;
    }
}
