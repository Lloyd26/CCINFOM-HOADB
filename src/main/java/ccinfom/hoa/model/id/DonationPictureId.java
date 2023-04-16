package ccinfom.hoa.model.id;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class DonationPictureId implements Serializable {
    private static final long serialVersionUID = 5800855778013124641L;
    @Column(name = "donation_id", nullable = false)
    private Integer donationId;

    @Column(name = "picturefile", nullable = false, length = 45)
    private String picturefile;

    public Integer getDonationId() {
        return donationId;
    }

    public void setDonationId(Integer donationId) {
        this.donationId = donationId;
    }

    public String getPicturefile() {
        return picturefile;
    }

    public void setPicturefile(String picturefile) {
        this.picturefile = picturefile;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        DonationPictureId entity = (DonationPictureId) o;
        return Objects.equals(this.picturefile, entity.picturefile) &&
                Objects.equals(this.donationId, entity.donationId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(picturefile, donationId);
    }

}