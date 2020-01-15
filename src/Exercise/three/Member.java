package Exercise.three;

import java.time.LocalDate;
import java.time.Period;

/**
 * This class will keep the club members details
 */
public class Member {
    private String firstname;
    private String lastname;
    private String gender;
    private LocalDate dob;
    private Address address;
    private String nationality;

    /**
     * To create new member by initialising the object value
     * @param firstname is the first name of the member
     * @param lastname is the last name of the member
     * @param gender gender for the gender of the member
     * @param dob this is the date of birth
     * @param address the address of the member contained in its own class
     * @param nationality the nationality of the member
     */
    public Member(String firstname, String lastname, String gender, LocalDate dob, Address address, String nationality){
        this.firstname = firstname;
        this.lastname = lastname;
        this.gender = gender;
        this.dob = dob;
        this.address = address;
        this.nationality = nationality;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public int getAge(){
        //Today's date
        LocalDate today = LocalDate.now();
        //diff
        Period p=Period.between(dob, today);
        return p.getYears();
    }

    @Override
    public String toString() {
        return "Member{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", gender='" + gender + '\'' +
                ", dob=" + dob +
                ", address=" + address +
                ", nationality='" + nationality + '\'' +
                '}';
    }
}
