package ccinfom.hoa.model.id;

import java.io.Serializable;
import java.util.Objects;

public class ZipcodeId2 implements Serializable {

    private String barangay;
    private String city;
    private String province;

    public ZipcodeId2() {
    }

    public ZipcodeId2(String barangay, String city, String province) {
        this.barangay = barangay;
        this.city = city;
        this.province = province;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ZipcodeId2 zipcodeId = (ZipcodeId2) o;
        return barangay.equals(zipcodeId.barangay) && city.equals(zipcodeId.city) && province.equals(zipcodeId.province);
    }

    @Override
    public int hashCode() {
        return Objects.hash(barangay, city, province);
    }
}
