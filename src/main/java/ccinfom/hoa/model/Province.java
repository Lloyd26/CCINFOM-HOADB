package ccinfom.hoa.model;

import jakarta.persistence.*;

@Entity
@Table(name = "provinces")
public class Province {

    @Id
    @Column(name = "province", nullable = false, length = 45)
    private String id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "region", nullable = false)
    private RefRegions region;

    public RefRegions getRegion() {
        return region;
    }

    public void setRegion(RefRegions region) {
        this.region = region;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
