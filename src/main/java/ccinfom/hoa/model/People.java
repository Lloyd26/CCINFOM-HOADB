package ccinfom.hoa.model;

import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "people")
public class People {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "peopleid")
    private Integer peopleID;

    @Column(name = "lastname")
    private String lastName;

    @Column(name = "firstname")
    private String firstName;

    @Column(columnDefinition = "ENUM('M', 'F')")
    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Column
    private String email;

    @Column
    private String facebook;

    @Column(name = "picturefile")
    private String pictureFile;

    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "birthday")
    private Date birthday;

    //@MapsId
    @OneToMany(mappedBy = "peopleID",
                fetch = FetchType.LAZY,
                cascade = CascadeType.ALL)
    public List<PeopleMobileNumber> mobileNumber = new ArrayList<>();

    public Integer getId() {
        return peopleID;
    }

    public void setId(Integer peopleID) {
        this.peopleID = peopleID;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public String getPictureFile() {
        return pictureFile;
    }

    public void setPictureFile(String pictureFile) {
        this.pictureFile = pictureFile;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /*public List<PeopleMobileNumber> getMobileNumbers() {
        return mobileNumber;
    }

    public void setMobileNumber(List<PeopleMobileNumber> mobileNumber) {
        this.mobileNumber = mobileNumber;
    }*/

    public People() {
    }

    public People(String lastName, String firstName, Gender gender, String email, String facebook, String pictureFile, Date birthday) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.gender = gender;
        this.email = email;
        this.facebook = facebook;
        this.pictureFile = pictureFile;
        this.birthday = birthday;
    }
}