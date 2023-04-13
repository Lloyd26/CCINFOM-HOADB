package ccinfom.hoa.model.id;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class ZipcodeId implements Serializable {
    private static final long serialVersionUID = 6650489532630112108L;
    @Column(name = "barangay", nullable = false, length = 45)
    private String barangay;

    @Column(name = "city", nullable = false, length = 45)
    private String city;

    @Column(name = "province", nullable = false, length = 45)
    private String province;

    public String getBarangay() {
        return barangay;
    }

    public void setBarangay(String barangay) {
        this.barangay = barangay;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        ZipcodeId entity = (ZipcodeId) o;
        return Objects.equals(this.province, entity.province) &&
                Objects.equals(this.city, entity.city) &&
                Objects.equals(this.barangay, entity.barangay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(province, city, barangay);
    }

}