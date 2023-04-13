package ccinfom.hoa.model;

import ccinfom.hoa.model.id.ZipcodeId;
import jakarta.persistence.*;

@Entity
@Table(name = "zipcodes")
public class Zipcode {
    @EmbeddedId
    private ZipcodeId id;

    @MapsId("province")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "province", nullable = false)
    private Province province;

    @Column(name = "zipcode", length = 45)
    private String zipcode;

    public ZipcodeId getId() {
        return id;
    }

    public void setId(ZipcodeId id) {
        this.id = id;
    }

    public Province getProvince() {
        return province;
    }

    public void setProvince(Province province) {
        this.province = province;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

}