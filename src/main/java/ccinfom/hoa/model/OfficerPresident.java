package ccinfom.hoa.model;

import ccinfom.hoa.model.id.OfficerPresidentId;
import jakarta.persistence.*;

@Entity
@Table(name = "officer_presidents")
public class OfficerPresident {
    @EmbeddedId
    private OfficerPresidentId id;

    @MapsId("ho_id")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumns({
            @JoinColumn(name = "ho_id", nullable = false, referencedColumnName = "ho_id"),
            @JoinColumn(name = "position", nullable = false, referencedColumnName = "position"),
            @JoinColumn(name = "election_date", nullable = false, referencedColumnName = "election_date")
    })
    private Officer officer;

    public OfficerPresidentId getId() {
        return id;
    }

    public void setId(OfficerPresidentId id) {
        this.id = id;
    }

    public Officer getOfficer() {
        return officer;
    }

    public void setOfficer(Officer officer) {
        this.officer = officer;
    }

}