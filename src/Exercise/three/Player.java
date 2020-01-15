package Exercise.three;

import java.time.LocalDate;

public class Player extends Member {
    /**
     * To create new member by initialising the object value
     *
     * @param firstname   is the first name of the member
     * @param lastname    is the last name of the member
     * @param gender      gender for the gender of the member
     * @param dob         this is the date of birth
     * @param address     the address of the member contained in its own class
     * @param nationality the nationality of the member
     */
    public Player(String firstname, String lastname, String gender, LocalDate dob, Address address, String nationality) {
        super(firstname, lastname, gender, dob, address, nationality);
    }
}
