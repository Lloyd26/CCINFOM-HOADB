package ccinfom.hoa.model.id;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

@Embeddable
public class OfficerId implements Serializable {
    private static final long serialVersionUID = 2098420238717180937L;
    @Column(name = "ho_id", nullable = false)
    private Integer hoId;

    @Column(name = "position", nullable = false, length = 45)
    private String position;

    @Column(name = "election_date", nullable = false)
    private LocalDate electionDate;

    public Integer getHoId() {
        return hoId;
    }

    public void setHoId(Integer hoId) {
        this.hoId = hoId;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public LocalDate getElectionDate() {
        return electionDate;
    }

    public void setElectionDate(LocalDate electionDate) {
        this.electionDate = electionDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        OfficerId entity = (OfficerId) o;
        return Objects.equals(this.hoId, entity.hoId) &&
                Objects.equals(this.electionDate, entity.electionDate) &&
                Objects.equals(this.position, entity.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hoId, electionDate, position);
    }

}